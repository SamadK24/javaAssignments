package com.swabhav.exceptionHandling.test;

import java.util.Scanner;

import com.swabhav.exceptionHandling.model.AgeException;

public class AgeExceptionTest {
public static void main(String[] args) throws AgeException {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter age");
	int age=scanner.nextInt();
	
	if(age<18) {
		throw new AgeException("votes is below 18");
	}
	
	System.out.println("Eligible to vote");
}
}
