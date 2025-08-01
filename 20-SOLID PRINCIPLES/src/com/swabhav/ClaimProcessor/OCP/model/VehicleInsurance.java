package com.swabhav.ClaimProcessor.OCP.model;

public class VehicleInsurance implements IClaimProcessor {

	@Override
	public void claimType() {
		System.out.println("Claim type is vehicle");
		
	}

}
