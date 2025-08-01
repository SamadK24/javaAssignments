package com.swabhav.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.swabhav.streams.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Student> student = new ArrayList<Student>();
		System.out.println("Enter the your details");
		for (int i = 1; i <=3; i++) {
			System.out.println("Enter the name of " + i + " student");
			String name = scanner.nextLine();

			System.out.println("Enter the rollno of " + i + " student");
			int rollNo = scanner.nextInt();

			System.out.println("Enter the cgpa of " + i + " student");
			double cgpa = scanner.nextDouble();
			scanner.nextLine();

			student.add(new Student(name, rollNo, cgpa));
			
			
			
		}
		System.out.println(student);
		student.stream().map(s->s.name).sorted().forEach(System.out::println);
		System.out.println("----------------------------");
		student.stream().map(s->s.rollNo).sorted().forEach(System.out::println);
		System.out.println("----------------------------");
		student.stream().map(s->s.cgpa).sorted().forEach(System.out::println);
		student.stream()
		.sorted(Comparator.comparingDouble((Student s)->s.cgpa).reversed())
		.forEach(System.out::println);
		

	}
}
