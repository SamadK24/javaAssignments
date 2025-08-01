package com.swabhav.polymorphism.test;

import com.swabhav.polymorphism.model.Adder;

public class AdderTest {
public static void main(String[] args) {
	
	Adder adds=new Adder();
	
	int result=adds.add(2, 5);
	System.out.println("Addition of two int numbers is "+result);
	
	int result2=adds.add(2,3,4);
	System.out.println("Addition of three int numbers is "+result2);
	
	double result3=adds.add(3.4,4.4);
	System.out.println("Addition of two double numbers is "+result3);
	
	
	
}
}
