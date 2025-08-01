package com.swabhav.polymorphism.test;

import java.util.Scanner;

import com.swabhav.polymorphism.model.Calculator;

public class CalculatorTest {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	Calculator calci=new Calculator();
	
	calci.area(7.5);
	calci.area(4);
	double result=calci.area(3,4);
	//System.out.println(calci.area(3));
	System.out.println(result);
	
	
	
	
}
}
