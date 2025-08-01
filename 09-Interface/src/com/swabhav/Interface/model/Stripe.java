package com.swabhav.Interface.model;

public class Stripe implements IPaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("Stripe payment");
		
	}

}
