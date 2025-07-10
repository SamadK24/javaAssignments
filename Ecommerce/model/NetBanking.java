package com.swabhav.Ecommerce.model;

public class NetBanking implements IPaymentGateway {
    private double accountBalance = 100000;

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Payment amount must be greater than zero.");
        } else if (amount > accountBalance) {
            System.out.println("NetBanking payment failed: Insufficient funds.");
        } else {
            accountBalance -= amount;
            System.out.println("NetBanking payment successful: ₹" + amount);
        }
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0) {
            System.out.println("Refund amount must be greater than zero.");
        } else {
            accountBalance += amount;
            System.out.println("NetBanking refund processed: ₹" + amount);
        }
    }
}
