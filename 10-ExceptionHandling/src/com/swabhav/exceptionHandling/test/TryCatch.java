package com.swabhav.exceptionHandling.test;

import java.util.Scanner;

public class TryCatch {
public static void main(String[] args) {
	try {	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number 1");
	int num1=scanner.nextInt();
	System.out.println("Enter number 2");
	int num2=scanner.nextInt();
	

		double result= num1/num2;
	}
	catch(Exception e){
		System.out.println("The exception is "+e);
	}
	finally {
		System.out.println("The program ends");
	}
	
	
}
}
