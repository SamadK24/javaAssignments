package com.swabhav.Interface.model;

public class Razorpay implements IPaymentGateway {

	@Override
	public void processPayment() {
		System.out.println("Razorpay payment");
		
	}

}
