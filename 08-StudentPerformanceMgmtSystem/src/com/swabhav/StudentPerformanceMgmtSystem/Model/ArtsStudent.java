package com.swabhav.StudentPerformanceMgmtSystem.Model;

public class ArtsStudent extends Student {
  double historyMarks;
  double politicalScienceMarks;
  double sociologyMarks;
  
  public ArtsStudent(String name,int rollNumber,int stream,double historyMarks,double politicalScienceMarks,double sociologyMarks) {
		super(name,rollNumber,stream);
		this.historyMarks=historyMarks;
		this.politicalScienceMarks=politicalScienceMarks;
		this.sociologyMarks=sociologyMarks;
	}
  
	double average;
	char grade;
	
	@Override
	public void calculatePerformance() {
		double total= historyMarks+politicalScienceMarks+sociologyMarks;
		average= total/3f;
		int average3=(int)average;
	    grade= getGrade(average3);
		
		System.out.println("The total of 3 subject is : "+total);
		System.out.println("The avg is "+average);
		System.out.println("The grade is "+grade);
		
	}

	private char getGrade(double avg) {
		if(avg>=90) return 'A';
		else if(avg>=75) return 'B';
		else if (avg>=60) return 'C';
		else return 'D';
	}
	
	@Override
	public void displayPerformance(boolean details) {
		if(details) {
			System.out.println("Physics marks is "+historyMarks);
			System.out.println("Math marks is "+politicalScienceMarks);
			System.out.println("Chem marks is "+sociologyMarks);
			System.out.println("Avg marks is "+average);
			
		}
	}
	@Override
	public void displayPerformance() {
		
			System.out.println("Your grade us : "+getGrade(average));
		
	}
 
}
