package com.swabhav.Interface.model;

public class PayPal implements IPaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("Paypal Payment");
		
	}

}
