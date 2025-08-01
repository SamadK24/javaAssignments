package com.swabhav.Candidates.Model;

public class Candidates {
	String name ;
	int age;
	
	public Candidates(String name , int age) {
		this.name = name ;
		this.age = age ;
	}

	@Override
	public String toString() {
		return "[name= " + name + ", age= " + age + "]";
	}
	
	
}
