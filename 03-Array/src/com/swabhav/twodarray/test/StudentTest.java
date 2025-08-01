package com.swabhav.twodarray.test;

import java.util.Scanner;

import com.swabhav.array.model.Students;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int numberOfstudents = scanner.nextInt();
		scanner.nextLine();
		Students[] students = new Students[numberOfstudents];

		for (int i = 0; i < numberOfstudents; i++) {
			System.out.println("Enter details of students");
			System.out.println("Enter the name of " + (i + 1) + " student");
			String name = scanner.nextLine();
			System.out.println("Enter the rollno of " + (i + 1) + " student");
			int rollno = scanner.nextInt();
			System.out.println("Enter the cgpa of " + (i + 1) + " student");
			double cgpa = scanner.nextDouble();
			scanner.nextLine();

			students[i] = new Students(name, rollno, cgpa);
		}

		System.out.println("The details of Students are");

		for (Students result : students) {
			result.display();
		}

	}
}
