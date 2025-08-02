package com.swabhav.BankingApp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.swabhav.BankingApp.model.ManagerPanel;
import com.swabhav.BankingApp.model.UserPortal;

public class BankAppTest {
    private static final Scanner sc = new Scanner(System.in);
    private static final String DB_URL = "jdbc:mysql://localhost:3306/banking_system";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "samadkasu12@#";

    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println(GREEN + "\n✅ Connected to the database successfully!" + RESET);
        } catch (SQLException e) {
            System.out.println(RED + "❌ Failed to connect to the database: " + e.getMessage() + RESET);
            return;
        }

        while (true) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Manager Panel");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = getValidatedIntInput();

            switch (choice) {
                case 1:
                    managerLogin();
                    break;
                case 2:
                    userLogin();
                    break;
                case 3:
                    System.out.println("Thank you for using the Banking System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }

    private static void managerLogin() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter Manager Password: ");
            String inputPassword = sc.nextLine();

            if (isValidManager(inputPassword)) {
                System.out.println(GREEN + "✅ Manager login successful." + RESET);
                ManagerPanel.displayManagerMenu();
                return;
            } else {
                System.out.println(RED + "Incorrect password." + RESET);
                attempts++;
            }
        }

        System.out.print("Too many failed attempts. Do you want to continue? (Y/N): ");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            managerLogin();
        } else {
            System.out.println("Returning to main menu.");
        }
    }

    private static boolean isValidManager(String password) {
        String sql = "SELECT * FROM admin WHERE password = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.out.println(RED + "Database error (manager check): " + e.getMessage() + RESET);
        }
        return false;
    }

    private static void userLogin() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter Account ID: ");
            int id = getValidatedIntInput();

            System.out.print("Enter 4-digit PIN: ");
            int pin = getValidatedIntInput();

            if (isValidUser(id, pin)) {
                System.out.println(GREEN + "✅ User login successful." + RESET);
                UserPortal.launchUserMenu(id);
                return;
            } else {
                System.out.println(RED + "Invalid credentials." + RESET);
                attempts++;
            }
        }

        System.out.print("Too many failed attempts. Do you want to continue? (Y/N): ");
        if (sc.nextLine().equalsIgnoreCase("Y")) {
            userLogin();
        } else {
            System.out.println("Returning to main menu.");
        }
    }

    private static boolean isValidUser(int id, int pin) {
        String sql = "SELECT * FROM accounts WHERE id = ? AND pin = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setInt(2, pin);
            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.out.println(RED + "Database error (user check): " + e.getMessage() + RESET);
        }
        return false;
    }

    private static int getValidatedIntInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid number: ");
            }
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}

