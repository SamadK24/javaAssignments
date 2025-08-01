package com.swabhav.Fiight_Fare.Model;

import java.util.Comparator;

public class FareInDesc implements Comparator<Flight_Fare> {

	@Override
	public int compare(Flight_Fare o1, Flight_Fare o2) {
		return Double.compare(o2.fare , o1.fare);
	}

}
