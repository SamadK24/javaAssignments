package com.swabhav.ClaimProcessor.OCP.model;

public class LifeInsurance implements IClaimProcessor {

	@Override
	public void claimType() {
		System.out.println("Insurance type is Life");
		
	}

}
