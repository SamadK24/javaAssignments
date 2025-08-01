package com.swabhav.serialdeserial.model;

import java.io.Serializable;

public class Employee implements Serializable{
	String name;
	int ID;
	double salary;

	public Employee(String name, int ID, double salary) {
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
	
	public void Display() {
		System.out.println("Employee's name is "+name);
		System.out.println("Employee's ID is "+ID);
		System.out.println("Employee's salary is "+salary);
		
	}
}
