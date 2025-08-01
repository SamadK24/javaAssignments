package com.swabhav.inheritance.model;

public class Student {
 String name,department,courses;
 int rollno;
 static int totalstudent;
 static int totalcourse;
   
 public Student(String name,String department,String courses,int rollno) {
	 this.name=name;
	 this.department=department;
	 this.courses=courses;
	 this.rollno=rollno;
 }
 
}
