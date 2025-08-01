package com.swabhav.StudentPerformanceMgmtSystem.Model;

public class CommerceStudent extends Student {
    double accountMarks;
    double businessStudiesMarks;
    double ecoMarks;
    
    public CommerceStudent(String name,int rollNumber,int stream,double accountMarks,double businessStudiesMarks,double ecoMarks) {
		super(name,rollNumber,stream);
		this.accountMarks=accountMarks;
		this.businessStudiesMarks=businessStudiesMarks;
		this.ecoMarks=ecoMarks;
	}
    
	double average;
	char grade;
	@Override
	public void calculatePerformance() {
		double total= accountMarks+businessStudiesMarks+ecoMarks;
		average= total/3f;
		int average2=(int)average;
	    grade= getGrade(average2);
		
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
			System.out.println("Stream :-----Commerce");
			System.out.println("Account marks is "+accountMarks);
			System.out.println("Business Studies marks is "+businessStudiesMarks);
			System.out.println("Eco marks is "+ecoMarks);
			System.out.println("Avg marks is "+average);
			
		}
	}
	@Override
	public void displayPerformance() {
		
			System.out.println("Your grade us : "+getGrade(average));
		
	}
}
