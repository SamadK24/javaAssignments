package com.swabhav.consumer.test;

public class StudentPredicateEg {

	String name;
	int marks;
	
	
	public StudentPredicateEg(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	

	@Override
	public String toString() {
		
		return name + "-" + marks;
	}
}


