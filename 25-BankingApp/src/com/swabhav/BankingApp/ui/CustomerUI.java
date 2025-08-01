package com.swabhav.BankingApp.ui;

import java.util.Scanner;
import com.swabhav.BankingApp.model.BankService;
import com.swabhav.BankingApp.model.InvalidAmountException;
import com.swabhav.BankingApp.model.InvalidInputException;

public class CustomerUI {
    private static Scanner sc = new Scanner(System.in);
    private static BankService bankService = new BankService();

    public static void loginAndShowCustomerMenu() {
        String username = InputUtil.readValidUsername("Enter Username: ");
        String password = InputUtil.readValidPassword("Enter Password: ");

        int accId = bankService.authenticateCustomer(username, password);
       
        if (accId == -1) {
            System.out.println("Invalid credentials or inactive account.");
            return;
        }

        showCustomerMenu(accId);
    }

    private static void showCustomerMenu(int accId) {
        while (true) {
            System.out.println("\n===== Customer Menu =====");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Money");
            System.out.println("5. View Transaction History");
            System.out.println("6. Logout");

            int choice = InputUtil.readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    bankService.checkBalance(accId);
                    break;
                case 2:
                    handleDeposit(accId);
                    break;
                case 3:
                    handleWithdraw(accId);
                    break;
                case 4:
                    handleTransfer(accId);
                    break;
                case 5:
                    bankService.transactionHistory(accId);
                    break;
                case 6:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void handleDeposit(int accId) {
        try {
            double amount = InputUtil.readValidAmount("Enter amount to deposit: ");
            bankService.deposit(accId, amount);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleWithdraw(int accId) {
        try {
            double amount = InputUtil.readValidAmount("Enter amount to withdraw: ");
            bankService.withDraw(accId, amount);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleTransfer(int fromAccId) {
        try {
            int toAccId = InputUtil.readInt("Enter recipient Account ID: ");
            if (!bankService.isValidAccount(toAccId)) {
                System.out.println("Invalid recipient account.");
                return;
            }

            double amount = InputUtil.readValidAmount("Enter amount to transfer: ");
            bankService.transferMoney(fromAccId, toAccId, amount);
        } catch (InvalidAmountException | InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
