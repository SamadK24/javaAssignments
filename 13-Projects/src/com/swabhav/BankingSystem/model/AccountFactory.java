package com.swabhav.BankingSystem.model;

public class AccountFactory {

    public static IAccountOperations createAccount(String type, String name, String accNo, double balance) {
        switch (type.toLowerCase()) {
            case "savings":
                return new SavingsAccount(name, accNo, balance);
            case "current":
                return new CurrentAccount(name, accNo, balance);
            case "loan":
                return new LoanAccount(name, accNo, balance);
            default:
                return null;
        }
    }
}
