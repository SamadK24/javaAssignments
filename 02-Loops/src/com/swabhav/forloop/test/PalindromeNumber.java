package com.swabhav.forloop.test;

public class PalindromeNumber {
	public static void main(String[] args) {
		int originalnumber = 1221;
		int lastdigit;
		int reversenumber=0;
		for (int number = originalnumber; number!=0; number=number/10) {
			lastdigit = number % 10;
			reversenumber = reversenumber * 10 + lastdigit;
			

		}
		if(originalnumber==reversenumber) {
			System.out.println("The given number is a palindrome");
		}
		else {
			System.out.println("The given number is not a palindrome");
		}
	}
}

