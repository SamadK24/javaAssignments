package com.swabhav.BankingSystem.model;

public interface IAccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
