package com.swabhav.model;

public class Calculator {

	
	public int addition(int num1,int num2) {
		return num1+num2;
	}
	
	public int subtraction(int num1,int num2) {
		return num1-num2;
	}
	
	public int division(int num1,int num2) {
		if(num2==0) throw new ArithmeticException();
		return num1/num2;
	}
}
