package com.swabhav.StudentPerformanceMgmtSystem.Model;

public abstract class Student {
  String name;
  int rollNumber;
  int stream;
  
  
  public Student(String name,int rollNumber,int stream) {
	  this.name=name;
	  this.rollNumber=rollNumber;
	  this.stream=stream;
  }
  
  public abstract void calculatePerformance();
  public abstract void displayPerformance(boolean details);
  public abstract void displayPerformance();
  
  public void displayInfo() {
	  System.out.println("Student details ");
	  System.out.println("Student name : "+name);
	  System.out.println("Students rollno : "+rollNumber);
	  System.out.println("Students stream : "+stream);
  }
}
