package com.swabhav.Ecommerce.model;


public class Checkout {
    private IPaymentGateway gateway;

    public Checkout(IPaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void makePayment(double amount) {
        gateway.pay(amount);
    }

    public void processRefund(double amount) {
        gateway.refund(amount);
    }
}
