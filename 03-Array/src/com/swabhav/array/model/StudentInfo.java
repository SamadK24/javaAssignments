package com.swabhav.array.model;

import java.util.Arrays;

public class StudentInfo {
	String name;
	int rollno;
	int[] marks;

	public StudentInfo(String name, int rollno, int[] marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;

	}

	public void display() {
	 System.out.println("Name "+name+" Rollno:"+rollno+"marks:"+Arrays.toString(marks));
 }
}
