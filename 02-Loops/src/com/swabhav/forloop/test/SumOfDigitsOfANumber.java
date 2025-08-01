package com.swabhav.forloop.test;

public class SumOfDigitsOfANumber {
public static void main(String[] args) {
	int originalnumber=12345;
	int sumOfdigits=0;
	
	for(int number=originalnumber;number!=0;number=number/10) {
		int lastdigit=number%10;
		sumOfdigits=sumOfdigits+lastdigit;
	}
	
	System.out.println("The sum of digits of a number are"+ sumOfdigits);
}
}
