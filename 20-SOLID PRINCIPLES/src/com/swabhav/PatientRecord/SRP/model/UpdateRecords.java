package com.swabhav.PatientRecord.SRP.model;

public class UpdateRecords {
public void format(PatientData format) {
	System.out.println("Patient record generated");
	System.out.println("Patients name is "+ format.getName());
	System.out.println("Patients age is "+format.getAge());
	System.out.println("Patients disease is "+format.getDisease());
}
}
