package com.swabhav.Fiight_Fare.Test;

import java.util.ArrayList;
import java.util.Collections;

import com.swabhav.Fiight_Fare.Model.FareInDesc;
import com.swabhav.Fiight_Fare.Model.Flight_Fare;

public class Flight_Booking {
	public static void main(String[] args) {
		ArrayList<Flight_Fare> booking = new ArrayList<Flight_Fare>();
		
		booking.add(new Flight_Fare("Indigo", 30000));
		booking.add(new Flight_Fare("Air_India", 100000));
		booking.add(new Flight_Fare("Spice_Jet", 80000));
		booking.add(new Flight_Fare("Emirate", 20000));
		booking.add(new Flight_Fare("9/11", 5000));
		
		System.out.println("Before Fare sorting ");
		System.out.println(booking);
		System.out.println();
		Collections.sort(booking , new FareInDesc());
		System.out.println("After Fare sorting Descending ");
		System.out.println(booking);
	}
}
