package com.swabhav.array.model;

public class Students {

	String name;
	int rollno;
	double cgpa;

	public Students(String name, int rollno, double cgpa) {
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}

	public void display() {
		System.out.println("Name : " + name + " Rollno : " + rollno + " Cgpa " + cgpa);
	}
}
