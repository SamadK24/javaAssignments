package com.swabhav.serialdeserial.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.swabhav.serialdeserial.model.Employee;

public class EmployeeTest {
public static void main(String[] args) throws FileNotFoundException, IOException {
	
	Employee employee=new Employee("Samad",34,23571.0);
	
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("employee.txt"));
	out.writeObject(employee);
	out.close();
	System.out.println("object saved successfully");
	
	
}
}
