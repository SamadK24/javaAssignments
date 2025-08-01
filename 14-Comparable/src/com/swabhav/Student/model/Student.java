package com.swabhav.Student.model;

public class Student implements Comparable<Student> {

	int rollNum;
	String name;
	
	public Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.rollNum-student.rollNum;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
}
