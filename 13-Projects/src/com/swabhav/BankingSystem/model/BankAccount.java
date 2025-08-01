package com.swabhav.BankingSystem.model;

public abstract class BankAccount implements IAccountOperations {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Optional helper to show account summary
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
