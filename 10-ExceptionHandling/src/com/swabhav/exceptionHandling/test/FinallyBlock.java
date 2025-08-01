package com.swabhav.exceptionHandling.test;

import java.util.Scanner;

public class FinallyBlock {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int accBalance=10000;
	
	System.out.println("Enter the amount to withdraw ");
	int amount=scanner.nextInt();
	try {
		if(amount>accBalance) {
			throw new ArithmeticException("Amount exceeds current balance");
		}
		else {
			int newAmount=accBalance-amount;
			System.out.println("Current Balance is "+newAmount);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Transaction session ended");
	}
}
}
