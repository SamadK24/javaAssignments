package com.swabhav.BankingSystem.model;

public class LoanAccount extends BankAccount {

    public LoanAccount(String name, String accNo, double loanAmount) {
        super(name, accNo, -loanAmount); // Start with negative balance = loan taken
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposits are not allowed in a Loan Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount; // Going deeper into debt
            System.out.println("Withdrew ₹" + amount + " from Loan Account. Outstanding loan increased.");
        }
    }
}
