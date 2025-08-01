package com.swabhav.test;

public class LargestOfThreeNumber {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 12;
		int number3 = 1;

		if (number1 > number2 & number1 > number3) {
			System.out.println("Number1 is the greatest");
		} else if (number2 > number1 & number2 > number3) {
			System.out.println("Number2 is the greatest");
		} else {
			System.out.println("Number3 is the greatest");
		}

	}
}
