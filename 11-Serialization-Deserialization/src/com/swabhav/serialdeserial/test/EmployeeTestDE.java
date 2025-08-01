package com.swabhav.serialdeserial.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.swabhav.serialdeserial.model.Employee;

public class EmployeeTestDE {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

	
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.txt"));
	Employee emp2= (Employee)in.readObject();
	in.close();
	System.out.println("object restored");
	emp2.Display();
	
}
}
