package com.CommandLineUserInput;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println("Enter the operation you want to perform");
		System.out.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");

		int choice = scanner.nextInt();
		int result;

		switch (choice) {
		case 1:
			result = number1 + number2;
			System.out.println("The additon of two numbers is " + result);
			break;
		case 2:
			result = number1 - number2;
			System.out.println("The subtraction of two numbers is " + result);
			break;

		case 3:
			result = number1 * number2;
			System.out.println("The multiplication of two numbers is " + result);
			break;

		case 4:
			result = number1 / number2;
			System.out.println("The division of two numbers is " + result);
			break;

		default:
			System.out.println("Invalid choice");
			break;

		}

	}
}
