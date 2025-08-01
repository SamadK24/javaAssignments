package com.swabhav.BankingApp.model;

public class Validator {

    public static void validateName(String name) throws InvalidInputException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidInputException("❌ Name cannot be empty.");
        }
    }

    public static void validateAmount(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("❌ Amount cannot be negative.");
        }
    }

    public static void validateAccountId(int accId) throws InvalidInputException {
        if (accId <= 0) {
            throw new InvalidInputException("❌ Account ID must be a positive number.");
        }
    }
}

