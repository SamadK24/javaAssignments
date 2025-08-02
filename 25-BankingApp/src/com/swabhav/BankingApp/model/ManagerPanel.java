package com.swabhav.BankingApp.model;

import java.sql.*;
import java.util.Scanner;

public class ManagerPanel {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/banking_system";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "your_password";

    private static final Scanner input = new Scanner(System.in);

    public static boolean authenticate() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter Admin Password: ");
            String enteredPassword = input.nextLine();

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT password FROM admin LIMIT 1")) {

                if (rs.next() && enteredPassword.equals(rs.getString("password"))) {
                    return true;
                } else {
                    System.out.println("Incorrect password. Try again.\n");
                    attempts++;
                }

            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
                return false;
            }
        }

        System.out.print("Too many failed attempts. Do you want to continue? (yes/no): ");
        String retry = input.nextLine();
        return retry.equalsIgnoreCase("yes");
    }

    public static void displayManagerMenu() {
        while (true) {
            System.out.println("\n========== MANAGER MENU ==========");
            System.out.println("1. View All Accounts");
            System.out.println("2. Delete Customer Account");
            System.out.println("3. View Transaction History (Any Account)");
            System.out.println("4. Add New Customer Account");
            System.out.println("5. Update Account Name (KYC)");
            System.out.println("6. Freeze / Unfreeze Account");
            System.out.println("7. Change Admin Password");
            System.out.println("8. Logout");
            System.out.print("Choose an option: ");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1 -> displayAllAccounts();
                case 2 -> removeAccount();
                case 3 -> displayAccountTransactions();
                case 4 -> createNewAccount();
                case 5 -> updateAccountName();
                case 6 -> toggleAccountStatus();
                case 7 -> updateAdminPassword();
                case 8 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void displayAllAccounts() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM accounts")) {

            printTopBorder();
            printHeaderRow();
            printMidBorder();

            while (rs.next()) {
                System.out.printf("│ %-10d │ %-12s │ %-18.2f │ %-10s │ %-12s │%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("balance"),
                        rs.getString("account_type"),
                        rs.getBoolean("is_frozen") ? "Frozen" : "Active");
            }

            printBottomBorder();

        } catch (SQLException e) {
            System.out.println("Error fetching accounts: " + e.getMessage());
        }
    }

    private static void removeAccount() {
        System.out.print("Enter Account ID to delete: ");
        int accountId = input.nextInt();
        input.nextLine();

        String query = "DELETE FROM accounts WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, accountId);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Account deleted.");
            } else {
                System.out.println("Account not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting account: " + e.getMessage());
        }
    }

    private static void displayAccountTransactions() {
        System.out.print("Enter Account ID: ");
        int accountId = input.nextInt();
        input.nextLine();

        String query = "SELECT * FROM transactions WHERE account_id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, accountId);
            ResultSet rs = stmt.executeQuery();

            System.out.println("\nTransaction History:");
            System.out.printf("%-5s %-10s %-10s %-20s%n", "ID", "Type", "Amount", "Timestamp");

            while (rs.next()) {
                System.out.printf("%-5d %-10s %-10.2f %-20s%n",
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("timestamp"));
            }

        } catch (SQLException e) {
            System.out.println("Error fetching transactions: " + e.getMessage());
        }
    }

    private static void createNewAccount() {
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter 4-digit PIN: ");
        int pin = input.nextInt();
        System.out.print("Initial Deposit: ");
        double deposit = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Account Type (Savings/Current/Salary): ");
        String accountType = input.nextLine();

        String query = "INSERT INTO accounts (name, pin, balance, account_type) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setInt(2, pin);
            stmt.setDouble(3, deposit);
            stmt.setString(4, accountType);
            stmt.executeUpdate();
            System.out.println("Account created successfully.");

        } catch (SQLException e) {
            System.out.println("Error adding account: " + e.getMessage());
        }
    }

    private static void updateAccountName() {
        System.out.print("Enter Account ID to update name: ");
        int accountId = input.nextInt();
        input.nextLine();
        System.out.print("Enter new name: ");
        String newName = input.nextLine();

        String query = "UPDATE accounts SET name = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newName);
            stmt.setInt(2, accountId);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Name updated.");
            } else {
                System.out.println("Account not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating name: " + e.getMessage());
        }
    }

    private static void toggleAccountStatus() {
        System.out.print("Enter Account ID to toggle freeze status: ");
        int accountId = input.nextInt();
        input.nextLine();

        String query = "UPDATE accounts SET is_frozen = NOT is_frozen WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, accountId);
            int updated = stmt.executeUpdate();

            if (updated > 0) {
                System.out.println("Account freeze status updated.");
            } else {
                System.out.println("Account not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error freezing/unfreezing account: " + e.getMessage());
        }
    }

    private static void updateAdminPassword() {
        System.out.print("Enter new Admin password: ");
        String newPassword = input.nextLine();

        String query = "UPDATE admin SET password = ? WHERE id = 1";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, newPassword);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Password updated.");
            } else {
                System.out.println("Update failed.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating password: " + e.getMessage());
        }
    }

    private static void printTopBorder() {
        System.out.println("┌────────────┬──────────────┬────────────────────┬────────────┬──────────────┐");
    }

    private static void printHeaderRow() {
        System.out.printf("│ %-10s │ %-12s │ %-18s │ %-10s │ %-12s │%n",
                "Account ID", "Name", "Balance", "Type", "Status");
    }

    private static void printMidBorder() {
        System.out.println("├────────────┼──────────────┼────────────────────┼────────────┼──────────────┤");
    }

    private static void printBottomBorder() {
        System.out.println("└────────────┴──────────────┴────────────────────┴────────────┴──────────────┘");
    }
}