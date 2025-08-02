package com.swabhav.BankingApp.model;

import java.sql.*;
import java.util.Scanner;

public class UserPortal {
    private static final String DB_LINK = "jdbc:mysql://localhost:3306/banking_system";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "your_password";
    private static final Scanner inputReader = new Scanner(System.in);

    public static void launchUserMenu(int userId) {
        while (true) {
            System.out.println("\n========== USER DASHBOARD ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Credit Amount");
            System.out.println("3. Debit Amount");
            System.out.println("4. Initiate Transfer");
            System.out.println("5. View Transaction Log");
            System.out.println("6. Logout");
            System.out.print("Select an option: ");

            int selection = inputReader.nextInt();
            inputReader.nextLine();

            switch (selection) {
                case 1:
                    fetchBalance(userId);
                    break;
                case 2:
                    creditToAccount(userId);
                    break;
                case 3:
                    debitFromAccount(userId);
                    break;
                case 4:
                    executeTransfer(userId);
                    break;
                case 5:
                    displayTransactionLog(userId);
                    break;
                case 6:
                    System.out.println("Signing out...");
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    private static void fetchBalance(int userId) {
        String query = "SELECT balance FROM accounts WHERE id = ?";
        try (Connection db = DriverManager.getConnection(DB_LINK, DB_USER, DB_PASS);
             PreparedStatement pst = db.prepareStatement(query)) {

            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Available Balance: ₹" + rs.getDouble("balance"));
            } else {
                System.out.println("Account could not be located.");
            }

        } catch (SQLException e) {
            System.out.println("Unable to retrieve balance: " + e.getMessage());
        }
    }

    private static void creditToAccount(int userId) {
        System.out.print("Enter amount to credit: ");
        double creditAmt = inputReader.nextDouble();
        inputReader.nextLine();

        if (creditAmt <= 0) {
            System.out.println("Invalid credit amount.");
            return;
        }

        String updateSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        String insertTxn = "INSERT INTO transactions (account_id, type, amount) VALUES (?, 'Deposit', ?)";

        try (Connection db = DriverManager.getConnection(DB_LINK, DB_USER, DB_PASS)) {
            db.setAutoCommit(false);

            try (PreparedStatement updateStmt = db.prepareStatement(updateSql);
                 PreparedStatement txnStmt = db.prepareStatement(insertTxn)) {

                updateStmt.setDouble(1, creditAmt);
                updateStmt.setInt(2, userId);
                updateStmt.executeUpdate();

                txnStmt.setInt(1, userId);
                txnStmt.setDouble(2, creditAmt);
                txnStmt.executeUpdate();

                db.commit();
                System.out.println("Amount successfully credited.");
            } catch (SQLException e) {
                db.rollback();
                System.out.println("Transaction unsuccessful: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    private static void debitFromAccount(int userId) {
        System.out.print("Enter amount to withdraw: ");
        double debitAmt = inputReader.nextDouble();
        inputReader.nextLine();

        if (debitAmt <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        String checkBalance = "SELECT balance FROM accounts WHERE id = ?";
        String updateSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String insertTxn = "INSERT INTO transactions (account_id, type, amount) VALUES (?, 'Withdraw', ?)";

        try (Connection db = DriverManager.getConnection(DB_LINK, DB_USER, DB_PASS)) {
            db.setAutoCommit(false);

            try (PreparedStatement balanceStmt = db.prepareStatement(checkBalance);
                 PreparedStatement debitStmt = db.prepareStatement(updateSql);
                 PreparedStatement txnStmt = db.prepareStatement(insertTxn)) {

                balanceStmt.setInt(1, userId);
                ResultSet rs = balanceStmt.executeQuery();

                if (rs.next() && rs.getDouble("balance") >= debitAmt) {
                    debitStmt.setDouble(1, debitAmt);
                    debitStmt.setInt(2, userId);
                    debitStmt.executeUpdate();

                    txnStmt.setInt(1, userId);
                    txnStmt.setDouble(2, debitAmt);
                    txnStmt.executeUpdate();

                    db.commit();
                    System.out.println("Withdrawal completed successfully.");
                } else {
                    System.out.println("Insufficient funds.");
                    db.rollback();
                }

            } catch (SQLException e) {
                db.rollback();
                System.out.println("Transaction failed: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Database connection issue: " + e.getMessage());
        }
    }

    private static void executeTransfer(int senderId) {
        System.out.print("Enter recipient Account ID: ");
        int recipientId = inputReader.nextInt();
        System.out.print("Enter transfer amount: ");
        double transferAmt = inputReader.nextDouble();
        inputReader.nextLine();

        if (transferAmt <= 0 || senderId == recipientId) {
            System.out.println("Invalid transfer details.");
            return;
        }

        String checkBalance = "SELECT balance FROM accounts WHERE id = ?";
        String deductSql = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String addSql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        String txnSql = "INSERT INTO transactions (account_id, type, amount) VALUES (?, ?, ?)";

        try (Connection db = DriverManager.getConnection(DB_LINK, DB_USER, DB_PASS)) {
            db.setAutoCommit(false);

            try (PreparedStatement checkStmt = db.prepareStatement(checkBalance);
                 PreparedStatement senderStmt = db.prepareStatement(deductSql);
                 PreparedStatement receiverStmt = db.prepareStatement(addSql);
                 PreparedStatement txnStmt = db.prepareStatement(txnSql)) {

                checkStmt.setInt(1, senderId);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next() && rs.getDouble("balance") >= transferAmt) {
                    senderStmt.setDouble(1, transferAmt);
                    senderStmt.setInt(2, senderId);
                    senderStmt.executeUpdate();

                    receiverStmt.setDouble(1, transferAmt);
                    receiverStmt.setInt(2, recipientId);
                    receiverStmt.executeUpdate();

                    txnStmt.setInt(1, senderId);
                    txnStmt.setString(2, "Sent");
                    txnStmt.setDouble(3, transferAmt);
                    txnStmt.executeUpdate();

                    txnStmt.setInt(1, recipientId);
                    txnStmt.setString(2, "Received");
                    txnStmt.setDouble(3, transferAmt);
                    txnStmt.executeUpdate();

                    db.commit();
                    System.out.println("Transfer completed.");
                } else {
                    System.out.println("Insufficient funds or invalid recipient.");
                    db.rollback();
                }

            } catch (SQLException e) {
                db.rollback();
                System.out.println("Transfer error: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Database issue: " + e.getMessage());
        }
    }

    private static void displayTransactionLog(int userId) {
        String fetchTxn = "SELECT * FROM transactions WHERE account_id = ?";

        try (Connection db = DriverManager.getConnection(DB_LINK, DB_USER, DB_PASS);
             PreparedStatement pst = db.prepareStatement(fetchTxn)) {

            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            drawTxnTop();
            drawTxnHeader();
            drawTxnMiddle();

            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                System.out.printf("│ %-10d │ %-12s │ %-12.2f │ %-20s │%n",
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("timestamp").toString());
            }

            if (!hasData) {
                System.out.println("│        No records found for this account.              │");
            }

            drawTxnBottom();

        } catch (SQLException e) {
            System.out.println("Error loading transaction log: " + e.getMessage());
        }
    }

    private static void drawTxnTop() {
        System.out.println("┌────────────┬──────────────┬──────────────┬──────────────────────┐");
    }

    private static void drawTxnHeader() {
        System.out.printf("│ %-10s │ %-12s │ %-12s │ %-20s │%n", "Txn ID", "Type", "Amount", "Timestamp");
    }

    private static void drawTxnMiddle() {
        System.out.println("├────────────┼──────────────┼──────────────┼──────────────────────┤");
    }

    private static void drawTxnBottom() {
        System.out.println("└────────────┴──────────────┴──────────────┴──────────────────────┘");
    }
}
