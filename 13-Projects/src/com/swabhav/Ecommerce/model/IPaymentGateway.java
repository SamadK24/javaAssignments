package com.swabhav.Ecommerce.model;

public interface IPaymentGateway {
    void pay(double amount);
    void refund(double amount);
}
