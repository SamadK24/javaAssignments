package com.swabhav.PatientRecord.SRP.model;

public class PatientEmail {

	
	public void email(PatientData mail) {
		System.out.println("Email sent to "+ mail.getName()+" with disease "+mail.getDisease());
	}
}
