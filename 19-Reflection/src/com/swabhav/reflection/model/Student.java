package com.swabhav.reflection.model;

public class Student {
 String name;
 int rollNumber;
 private double cgpa=9.0;
 
  public Student() {
	  
  }
  
  public Student(String name,int rollNumber,double cgpa) {
	  this.name=name;
	  this.rollNumber=rollNumber;
	  this.cgpa=cgpa;
  }
  
  void greet() {
	  System.out.println("Core Java is completed today");
  }
  
  private double result(double cgpa) {
	  return cgpa;
  }
}
