package com.swabhav.whileloop.test;

public class SumOfDigitsOfANumber {
	public static void main(String[] args) {
		int number = 12345;
		int sumofdigits = 0;
		int lastdigit;

		while (number != 0) {
			lastdigit = number % 10;
			sumofdigits = sumofdigits + lastdigit;
			number = number / 10;
		}
		System.out.println("The sum of digits is " + sumofdigits);

	}
}
