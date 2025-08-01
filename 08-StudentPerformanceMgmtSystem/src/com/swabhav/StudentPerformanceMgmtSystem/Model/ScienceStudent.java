package com.swabhav.StudentPerformanceMgmtSystem.Model;

public class ScienceStudent extends Student {

	double phyMarks;
	double mathMarks;
	double chemMarks;
	
	public ScienceStudent(String name,int rollNumber,int stream,double phyMarks,double mathMarks,double chemMarks) {
		super(name,rollNumber,stream);
		this.phyMarks=phyMarks;
		this.mathMarks=mathMarks;
		this.chemMarks=chemMarks;
	}

	double average;
	char grade;
	@Override
	public void calculatePerformance() {
		double total= phyMarks+mathMarks+chemMarks;
		average= total/3f;
		int average1=(int)average;
	  char grade= getGrade(average1);
		
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
			System.out.println("Stream :-----Science");
			System.out.println("Physics marks is "+phyMarks);
			System.out.println("Math marks is "+mathMarks);
			System.out.println("Chem marks is "+chemMarks);
			System.out.println("Avg marks is "+average);
			
		}
	}
	@Override
	public void displayPerformance() {
		
			System.out.println("Your grade us : "+getGrade(average));
		
	}

	

}
