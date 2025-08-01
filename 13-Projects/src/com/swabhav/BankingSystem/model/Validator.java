package com.swabhav.BankingSystem.model;

import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    // Validates account type input
    public static String getValidatedAccountType() {
        while (true) {
            System.out.print("Enter account type (Savings/Current/Loan): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("savings") || input.equals("current") || input.equals("loan")) {
                return input;
            } else {
                System.out.println("Invalid account type. Please try again.");
            }
        }
    }

    // Validates double input (e.g., deposit/withdraw amounts)
    public static double getValidatedAmount(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                double amount = Double.parseDouble(input);
                if (amount <= 0) {
                    System.out.println("Amount must be greater than zero. Try again.");
                } else {
                    return amount;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid amount.");
            }
        }
    }

    public static String getValidatedName(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Name cannot be empty. Try again.");
            } else if (!input.matches("[a-zA-Z ]+")) {
                System.out.println("Name must contain only letters and spaces. Try again.");
            } else {
                return input;
            }
        }
    }


    // Validates yes/no input
    public static boolean getYesNoInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                return true;
            } else if (input.equals("no") || input.equals("n")) {
                return false;
            } else {
                System.out.println("Please answer with 'yes' or 'no'.");
            }
        }
    }
    public static String getValidatedString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Input cannot be empty. Try again.");
            }
        }
    }

}
