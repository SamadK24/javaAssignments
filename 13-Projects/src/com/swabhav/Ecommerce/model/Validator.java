package com.swabhav.Ecommerce.model;

import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getValidatedPaymentType() {
        while (true) {
            System.out.print("Choose payment method (CreditCard/UPI/NetBanking): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("creditcard") || input.equals("upi") || input.equals("netbanking")) {
                return input;
            } else {
                System.out.println("Invalid payment method. Try again.");
            }
        }
    }

    public static double getValidatedAmount(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double amount = Double.parseDouble(input);
                if (amount <= 0) {
                    System.out.println("Amount must be greater than zero.");
                } else {
                    return amount;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid number.");
            }
        }
    }

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
}
