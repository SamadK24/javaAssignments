package com.swabhav.GuitarWithEnum.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List guitars;
  
  public Inventory() {
	  guitars=new LinkedList();
  }
  
  public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
	    Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
	    guitars.add(guitar);
	}

  
  public Guitar getGuitar(String serialNumber) {
	  for(Iterator i=guitars.iterator();i.hasNext(); ) {
		  Guitar guitar=(Guitar)i.next();
	      if(guitar.getSerialNumber().equals(serialNumber)) {
	    	  return guitar;
	      }
	  }
	  return null;
  }
  
  public List search(Guitar searchGuitar) {
	    List matchingGuitars=new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	        Guitar guitar = (Guitar) i.next();

	        Builder builder = searchGuitar.getBuilder();
	        if ((builder != null) && (!builder.equals(guitar.getBuilder()))) continue;

	        String model = searchGuitar.getModel();
	        if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel()))) continue;

	        Type type = searchGuitar.getType();
	        if ((type != null) && (!type.equals(guitar.getType()))) continue;

	        Wood backWood = searchGuitar.getBackWood();
	        if ((backWood != null) && (!backWood.equals(guitar.getBackWood()))) continue;

	        Wood topWood = searchGuitar.getTopWood();
	        if ((topWood != null) && (!topWood.equals(guitar.getTopWood()))) continue;

	        // All conditions matched, return the guitar
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars ;
	}

}

;