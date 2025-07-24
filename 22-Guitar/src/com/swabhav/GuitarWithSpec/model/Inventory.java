package com.swabhav.GuitarWithSpec.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	List<Guitar> guitars = new ArrayList<Guitar>();
	
	public void addGuitar(String serialNumber , double price , Guitarspec spec) {
		Guitar guitar = new Guitar(serialNumber , price , spec);
		guitars.add(guitar);
	}
	
	public List<Guitar> search(Guitarspec searchSpec){
		List<Guitar> matchingGuitar = new ArrayList<>();
		for(Guitar guitar : guitars) {
			if(guitar.getSpec().matches(searchSpec)) {
				matchingGuitar.add(guitar);
			}
		}
		return matchingGuitar;
	}
}
