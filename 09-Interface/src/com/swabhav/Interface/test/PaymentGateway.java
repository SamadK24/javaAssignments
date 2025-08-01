package com.swabhav.Interface.test;

import com.swabhav.Interface.model.PayPal;
import com.swabhav.Interface.model.Razorpay;
import com.swabhav.Interface.model.Stripe;

public class PaymentGateway {
public static void main(String[] args) {
	PayPal paypal=new PayPal();
	paypal.processPayment();
	
	Razorpay razorpay=new Razorpay();
	razorpay.processPayment();
	
	Stripe stripe= new Stripe();
	stripe.processPayment();
	
}
}
