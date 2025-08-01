package com.swabhav.forloop.test;

public class SwapTwoNumbersWithoutTemp {
public static void main(String[] args) {
	int number1=5,number2=10;
	
	System.out.println("Before swapping number1= " + number1 + " , number2 = "+ number2);
	number1=number1+number2;
	number2=number1-number2;
	number1=number1-number2;
	System.out.println("After swapping number1= " + number1 + " , number2 = "+ number2);
	
}
}
