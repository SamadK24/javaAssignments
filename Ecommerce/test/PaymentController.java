package com.swabhav.Ecommerce.test;

import java.util.Scanner;

import com.swabhav.Ecommerce.model.Checkout;
import com.swabhav.Ecommerce.model.CreditCard;
import com.swabhav.Ecommerce.model.IPaymentGateway;
import com.swabhav.Ecommerce.model.NetBanking;
import com.swabhav.Ecommerce.model.UPI;
import com.swabhav.Ecommerce.model.Validator;

public class PaymentController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to the Payment Gateway ===");

        boolean continueTransaction;

        do {
            // Step 1: Choose payment method
            String method = Validator.getValidatedPaymentType();
            IPaymentGateway gateway = null;

            switch (method) {
                case "creditcard":
                    gateway = new CreditCard();
                    break;
                case "upi":
                    gateway = new UPI();
                    break;
                case "netbanking":
                    gateway = new NetBanking();
                    break;
            }

            // Step 2: Create Checkout instance with selected gateway
            Checkout checkout = new Checkout(gateway);

            // Step 3: Choose operation: pay or refund — retry until valid
            String operation;
            while (true) {
                System.out.print("Do you want to 'pay' or 'refund'? ");
                operation = scanner.nextLine().trim().toLowerCase();

                if (operation.equals("pay") || operation.equals("refund")) {
                    break;
                } else {
                    System.out.println("Invalid operation. Please enter 'pay' or 'refund'.");
                }
            }

            // Step 4: Amount input and action
            double amount = Validator.getValidatedAmount("Enter amount: ");
            if (operation.equals("pay")) {
                checkout.makePayment(amount);
            } else {
                checkout.processRefund(amount);
            }

            // Step 5: Ask if user wants to continue
            continueTransaction = Validator.getYesNoInput("\nDo you want to make another transaction? (yes/no): ");

        } while (continueTransaction);

        System.out.println("Thank you for using the Payment Gateway. Goodbye!");
    }
}
