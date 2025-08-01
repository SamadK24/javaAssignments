package com.swabhav.Student.test;

import java.util.ArrayList;
import java.util.Collections;

import com.swabhav.Student.model.Student;

public class StudentTest {
public static void main(String[] args) {
	ArrayList<Student> list=new ArrayList<Student>();
	
	list.add(new Student(102,"Samad"));
	list.add(new Student(104,"Sama"));
	list.add(new Student(103,"Sam"));
	list.add(new Student(101,"Sa"));
	
	System.out.println("Before Sort "+list);
	Collections.sort(list);
	System.out.println("After Sort "+list);
	
	
}
}
