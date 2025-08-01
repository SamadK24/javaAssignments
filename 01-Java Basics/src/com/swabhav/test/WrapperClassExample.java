package com.swabhav.test;

public class WrapperClassExample {
public static void main(String[] args) {
	int number1=10;
	Integer number2=new Integer(number1);//boxing
	int number3=number2;//auto-unboxing
	
	char gender='M';
	Character gender2=gender;
	if(gender2==gender) {
		System.out.println("It works");
	}
	
	System.out.println("number3: "+number3);
}
}
