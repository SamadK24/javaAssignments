package com.swabhav.BankingApp.ui;

import java.util.Scanner;
import com.swabhav.BankingApp.model.Accounts;
import com.swabhav.BankingApp.model.BankService;
import com.swabhav.BankingApp.model.InvalidAmountException;

public class AdminUI {
    private static final Scanner sc = new Scanner(System.in);
    private static final BankService bankService = new BankService();

    public static void showAdminMenu() {
        while (true) {
            System.out.println("\n===== Admin Menu =====");
            System.out.println("1. Add New Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Back to Main Menu");

            int choice = InputUtil.readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    bankService.viewAllAccounts();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addAccount() {
        String name = InputUtil.readValidName("Enter Account Holder's Name: ");
        String username = InputUtil.readValidUsername("Set Username: ");
        String password = InputUtil.readValidPassword("Set Password: ");
        double balance;

        try {
            balance = InputUtil.readValidAmount("Enter Initial Balance: ");
        } catch (InvalidAmountException e) {
            System.out.println("Validation Error: ❌ " + e.getMessage());
            return;
        }

        Accounts acc = new Accounts();
        acc.setName(name);
        acc.setUsername(username);
        acc.setPassword(password);
        acc.setBalance(balance);

        bankService.addAccountWithCredentials(acc);
        System.out.println("✅ Account created successfully!");
    }

    public static boolean loginAsAdmin() {
        String username = InputUtil.readValidUsername("Enter Admin Username: ");
        String password = InputUtil.readValidPassword("Enter Admin Password: ");
        return username.equals("admin") && password.equals("admin123");
    }
}
