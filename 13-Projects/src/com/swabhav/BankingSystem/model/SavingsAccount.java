package com.swabhav.BankingSystem.model;

public class SavingsAccount extends BankAccount {
    private static final double WITHDRAW_LIMIT = 5000.0;

    public SavingsAccount(String name, String accNo, double initialBalance) {
        super(name, accNo, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to Savings Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > WITHDRAW_LIMIT) {
            System.out.println("Cannot withdraw more than ₹" + WITHDRAW_LIMIT + " in a single transaction.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        }
    }
}
