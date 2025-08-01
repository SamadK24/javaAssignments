package com.swabhav.forloop.test;

public class ReverseANumber {
	public static void main(String[] args) {
		int originalnumber = 987;
		int lastdigit;
		int reversenumber=0;
		System.out.println("The original number"+originalnumber);
		for (int number = originalnumber; number!=0; number=number/10) {
			lastdigit = number % 10;
			reversenumber = reversenumber * 10 + lastdigit;
			

		}
		System.out.println("The reversed number"+reversenumber);
	}
}
