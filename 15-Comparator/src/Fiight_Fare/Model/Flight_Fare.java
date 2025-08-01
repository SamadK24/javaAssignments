package com.swabhav.Fiight_Fare.Model;

public class Flight_Fare {
	String airline;
	double fare;

	public Flight_Fare(String airline , double fare) {
		this.airline = airline ; 
		this.fare  = fare;
	}

	@Override
	public String toString() {
		return "[airline=" + airline + ", fare=" + fare + "]";
	}
	
	
}
