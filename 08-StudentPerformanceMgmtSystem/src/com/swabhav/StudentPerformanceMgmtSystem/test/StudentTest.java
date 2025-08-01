package com.swabhav.StudentPerformanceMgmtSystem.test;

import java.util.Scanner;

import com.swabhav.StudentPerformanceMgmtSystem.Model.ArtsStudent;
import com.swabhav.StudentPerformanceMgmtSystem.Model.CommerceStudent;
import com.swabhav.StudentPerformanceMgmtSystem.Model.ScienceStudent;
import com.swabhav.StudentPerformanceMgmtSystem.Model.Student;

public class StudentTest {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	Student[] student=new Student[5];
	
	for(int i=0;i<5;i++) {
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		
		System.out.println("Enter yout rollNumber");
		int rollNumber=scanner.nextInt();
		
		System.out.println("enter your stream ");
		System.out.println("1.Science");
		System.out.println("2.Commerce");
		System.out.println("3.Arts");
		int choice=scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("enter your marks of physics");
			double physics=scanner.nextDouble();
			System.out.println("enter marks of math");
			double math= scanner.nextDouble();
			System.out.println("Enter marks of chem");
			double chemistry=scanner.nextDouble();
			System.out.println("Enter true for details or else false");
			boolean details=scanner.nextBoolean();
			
			ScienceStudent science=new ScienceStudent(name, rollNumber, choice, physics, math, chemistry);
			science.displayInfo();
			science.calculatePerformance();
			science.displayPerformance(details);
			science.displayPerformance();
			break;
		case 2:
			System.out.println("enter your marks of account");
			double accounts=scanner.nextDouble();
			System.out.println("enter marks of Business Studies");
			double businessStudies= scanner.nextDouble();
			System.out.println("Enter marks of eco");
			double economics=scanner.nextDouble();
			System.out.println("Enter true for details or else false");
			boolean details2=scanner.nextBoolean();
			
			CommerceStudent commerce= new CommerceStudent(name, rollNumber, choice, accounts, businessStudies, economics);
			commerce.displayInfo();
			commerce.calculatePerformance();
			commerce.displayPerformance(details2);
			commerce.displayPerformance();
			break;
			
					
		case 3:
			System.out.println("enter your marks of history");
			double history=scanner.nextDouble();
			System.out.println("enter marks of Political Science");
			double politicalScience= scanner.nextDouble();
			System.out.println("Enter marks of sociology");
			double sociology=scanner.nextDouble();
			System.out.println("Enter true for details or else false");
			boolean details3=scanner.nextBoolean();
			
			ArtsStudent arts = new ArtsStudent(name, rollNumber, choice, history, politicalScience, sociology);
			arts.displayInfo();
			arts.calculatePerformance();
			arts.displayPerformance(details3);
			arts.displayPerformance();
			break;
			
			default :
				System.out.println("Invalid choice");
			
		}
		
			
			
		
		
	}
}
}
