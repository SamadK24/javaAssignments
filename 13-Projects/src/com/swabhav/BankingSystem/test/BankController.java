package com.swabhav.BankingSystem.test;

import java.util.Scanner;

import com.swabhav.BankingSystem.model.AccountFactory;
import com.swabhav.BankingSystem.model.BankAccount;
import com.swabhav.BankingSystem.model.IAccountOperations;
import com.swabhav.BankingSystem.model.Validator;

public class BankController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("=== Welcome to Mini Bank ===");

        // Step 1: Ask how many accounts to simulate
        int numAccounts;
        while (true) {
            try {
                System.out.print("How many accounts do you want to create? ");
                numAccounts = Integer.parseInt(scanner.nextLine());
                if (numAccounts <= 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a positive integer.");
            }
        }

        IAccountOperations[] accounts = new IAccountOperations[numAccounts];

        // Step 2: Create each account with valid input
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("\n--- Setting up Account " + (i + 1) + " ---");

            String type = Validator.getValidatedAccountType();
            String name = Validator.getValidatedName("Enter account holder name: ");
            String accNo = Validator.getValidatedString("Enter account number: ");


            // For Savings/Current, get balance; for Loan, get loan amount
            double amount = Validator.getValidatedAmount(
                type.equals("loan")
                    ? "Enter loan amount: "
                    : "Enter initial balance: "
            );

            IAccountOperations account = AccountFactory.createAccount(type, name, accNo, amount);
            if (account != null) {
                accounts[i] = account;
                System.out.println("Account created successfully.\n");
            } else {
                System.out.println("Account creation failed. Retrying...");
                i--;
            }
        }

        // Step 3: Interact with each account
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\n=== Managing Account " + (i + 1) + " ===");

            IAccountOperations acc = accounts[i];
            ((BankAccount) acc).showAccountInfo();

            boolean exitAccount = false;

            while (!exitAccount) {
                System.out.println("\nChoose operation:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit this account");

                System.out.print("Enter choice: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        double depAmt = Validator.getValidatedAmount("Enter deposit amount: ");
                        acc.deposit(depAmt);
                        break;
                    case "2":
                        double wdAmt = Validator.getValidatedAmount("Enter withdraw amount: ");
                        acc.withdraw(wdAmt);
                        break;
                    case "3":
                        System.out.println("Current Balance: ₹" + acc.checkBalance());
                        break;
                    case "4":
                        exitAccount = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Try 1-4.");
                }
            }
        }

        System.out.println("\n=== Banking Simulation Complete ===");
    }
}
