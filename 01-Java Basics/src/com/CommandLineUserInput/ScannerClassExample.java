package com.CommandLineUserInput;

import java.util.Scanner;

public class ScannerClassExample {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	
	
	System.out.println("Enter your age ");
	int age=scanner.nextInt();
	
	scanner.nextLine();
	
	System.out.println("Enter your name ");
	String username=scanner.nextLine();
	
	System.out.println("Hello " + username + " , "+ age + " youre years old");
			
}
}
