package com.swabhav.twodarray.test;


import java.util.Scanner;

import com.swabhav.array.model.StudentInfo;

public class StudentInfoTest {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number of students");
	int size=scanner.nextInt();
	scanner.nextLine();
	
	StudentInfo[] studentinfo=new StudentInfo[size];
	
	
	for(int i=0;i<size;i++) {
		System.out.println("Enter name of "+(i+1)+" student");
		String name=scanner.nextLine();
		System.out.println("Enter rollno of "+(i+1)+" student");
		int rollno=scanner.nextInt();
		int []marks=new int[3];
		 for(int j=0;j<3;j++) {
			 System.out.println("enter subject marks ");
			 marks[j]=scanner.nextInt();
			 
			 
		 }
		 
		 scanner.nextLine();
		 studentinfo[i]=new StudentInfo(name,rollno,marks);
	}
	
	for(StudentInfo result:studentinfo) {
		result.display();
	}
}
}
