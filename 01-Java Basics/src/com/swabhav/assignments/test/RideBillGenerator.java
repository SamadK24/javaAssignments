package com.swabhav.assignments.test;

import java.util.Scanner;

public class RideBillGenerator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your height in cm :-");
		int height = scanner.nextInt();

		if (height < 120) {
			System.out.println("Can't ride");
			return;
		}

		int pay = 0;

		System.out.println("Can ride");

		System.out.print("Enter Your age :- ");
		int age = scanner.nextInt();

		if (age < 12) {
			System.out.println(pay = pay + 5);
		} else if (age > 12 || age < 18) {
			System.out.println(pay = pay + 7);
		} else if (age > 18 || age < 45) {
			System.out.println(pay = pay + 12);
		} else if (age > 45) {
			System.out.println("Pay +$0");
		}

		System.out.println("Do you want photo:-");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int choice = scanner.nextInt();
		if (choice == 1 && !(age > 45)) {
			pay = pay + 3;
		}

		System.out.println("Total bill is :-- " + pay);
		scanner.close();

	}
}
