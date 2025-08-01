package com.swabhav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    public static void main(String[] args) {
        Connection con = null;

        // 🔁 CHANGE THESE TWO IDs FOR DIFFERENT DEMO CASES
        int senderId = 1;     // Amit
        int receiverId = 2;   // Pramod

        try {
            // 1. Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to the DB
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_demo", "root", "samadKasu12@#");
            System.out.println("✅ Connection established successfully!!");

            // 3. Prevent self-transfer
            if (senderId == receiverId) {
                throw new IllegalArgumentException("❌ Transfer not allowed: self-transfer detected.");
            }

            // 4. Begin transaction
            con.setAutoCommit(false);

            // 5. Withdraw from sender
            PreparedStatement withdrawStmt = con.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE account_id = ? AND balance >= ?");
            withdrawStmt.setDouble(1, 5000);
            withdrawStmt.setInt(2, senderId);
            withdrawStmt.setDouble(3, 5000);

            int withdrawRows = withdrawStmt.executeUpdate();
            if (withdrawRows != 1) {
                throw new RuntimeException(
                    "❌ Withdrawal failed: Insufficient balance or account not found (ID: " + senderId + ")");
            }

            // 6. Deposit to receiver
            PreparedStatement depositStmt = con.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
            depositStmt.setDouble(1, 5000);
            depositStmt.setInt(2, receiverId);

            int depositRows = depositStmt.executeUpdate();
            if (depositRows != 1) {
                throw new RuntimeException(
                    "❌ Deposit failed: Destination account not found (ID: " + receiverId + ")");
            }

            // 7. Commit transaction
            con.commit();
            System.out.println("✅ Transaction successful! ₹5000 transferred from account ID " +
                               senderId + " to account ID " + receiverId + ".");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("↩️ Transaction rolled back.");
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            try {
                if (con != null && !con.isClosed()) {
                    con.setAutoCommit(true);
                    con.close();
                    System.out.println("🔌 Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
