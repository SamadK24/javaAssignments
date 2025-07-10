package com.swabhav.Ecommerce.model;

public class CreditCard implements IPaymentGateway {
    private double creditLimit = 50000;
    private double spent = 0;

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Payment amount must be greater than zero.");
        } else if (spent + amount > creditLimit) {
            System.out.println("Payment declined: Credit limit exceeded.");
        } else {
            spent += amount;
            System.out.println("CreditCard payment successful: ₹" + amount);
        }
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0 && amount<=10000) {
            System.out.println("Refund amount must be greater than zero.");
        } else {
            spent -= amount;
            System.out.println("CreditCard refund processed: ₹" + amount);
        }
    }
}