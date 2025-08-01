package com.swabhav.whileloop.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=7;
		int i=2;
		while(i<number) {
			if(number%i==0) {
				System.out.println("the number is not a prime number");
				break;
			}
			else {
				System.out.println("the number is a prime number");
				break;
			}
			i++;
		}
	}
}
