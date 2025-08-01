package com.swabhav.forloop.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 7;
		for (int i = 2; i <number; i++) {
			if (number % i == 0) {
				System.out.println("The given number is not a prime number");
				break;
			}
			else {
				System.out.println("The given number is a prime number");
				
			}
		}
	}
}
