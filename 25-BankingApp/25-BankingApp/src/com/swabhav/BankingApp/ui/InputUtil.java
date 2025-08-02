package com.swabhav.BankingApp.ui;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.swabhav.BankingApp.model.InvalidAmountException;
import com.swabhav.BankingApp.model.InvalidInputException;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static double readValidAmount(String prompt) throws InvalidAmountException {
        System.out.print(prompt);
        try {
            double amount = Double.parseDouble(sc.nextLine());
            if (amount <= 0) throw new InvalidAmountException("Amount must be greater than zero.");
            return amount;
        } catch (NumberFormatException e) {
            throw new InvalidAmountException("Invalid amount format.");
        }
    }

    public static String readValidName(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (input.matches("[A-Za-z ]{2,}")) return input;
            System.out.println("Invalid name. Only letters and spaces allowed, min 2 chars.");
        }
    }

    public static String readValidUsername(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (Pattern.matches("^[a-zA-Z0-9_]{4,15}$", input)) return input;
            System.out.println("Invalid username. Use 4–15 letters, digits or underscores.");
        }
    }

    public static String readValidPassword(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            if (input.length() >= 4) return input;
            System.out.println("Password too short. Minimum 4 characters.");
        }
    }
}
