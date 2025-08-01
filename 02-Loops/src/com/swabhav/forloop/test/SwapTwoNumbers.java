package com.swabhav.forloop.test;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int number1= 20;
		int number2 = 30;
		int temporary;
		
		System.out.println("Numbers before swapping are "+number1+ number2);
		
		temporary=number1;
		number1=number2;
		number2=temporary;
		
		System.out.println("Numbers after swapping are "+number1+number2);
	}
}
