package com.swabhav.BankingSystem.model;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String name, String accNo, double initialBalance) {
        super(name, accNo, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to Current Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Current Account.");
        }
    }
}
