package com.swabhav.PatientRecord.SRP.test;

import java.util.Scanner;

import com.swabhav.PatientRecord.SRP.model.PatientData;
import com.swabhav.PatientRecord.SRP.model.PatientEmail;
import com.swabhav.PatientRecord.SRP.model.UpdateRecords;

public class PatientTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter patients name");
	String name=scanner.nextLine();
	
	System.out.println("Enter patients age");
	int age=scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("Enter patients disease");
	String disease= scanner.nextLine();
	
	PatientData data=new PatientData(name, age, disease);
	
	PatientEmail email=new PatientEmail();
	email.email(data);
	
	UpdateRecords record=new UpdateRecords();
	record.format(data);
	
	
	
}
}
