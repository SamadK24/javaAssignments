package com.swabhav.Ecommerce.model;

public class UPI implements IPaymentGateway {
    private double balance = 20000;

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Payment amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Payment failed: Insufficient UPI balance.");
        } else {
            balance -= amount;
            System.out.println("UPI payment successful: ₹" + amount);
        }
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0) {
            System.out.println("Refund amount must be greater than zero.");
        } else {
            balance += amount;
            System.out.println("UPI refund processed: ₹" + amount);
        }
    }
}
