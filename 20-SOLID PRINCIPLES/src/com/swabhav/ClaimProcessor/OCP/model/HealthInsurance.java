package com.swabhav.ClaimProcessor.OCP.model;

public class HealthInsurance implements IClaimProcessor{

	@Override
	public void claimType() {
		System.out.println("Claim type is Health");
		
	}

}
