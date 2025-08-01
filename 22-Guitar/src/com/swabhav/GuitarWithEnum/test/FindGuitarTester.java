package com.swabhav.GuitarWithEnum.test;

import java.util.Iterator;
import java.util.List;

import com.swabhav.GuitarWithEnum.model.Builder;
import com.swabhav.GuitarWithEnum.model.Guitar;
import com.swabhav.GuitarWithEnum.model.Inventory;
import com.swabhav.GuitarWithEnum.model.Type;
import com.swabhav.GuitarWithEnum.model.Wood;



public class FindGuitarTester {
	 public static void main(String[] args) {
		
		 Inventory inventory=new Inventory();
		 initializeInventory(inventory);
		 
		 Guitar whatErinLikes = new Guitar(
				    "", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

		 List matchingGuitars=inventory.search(whatErinLikes);
		 if(!matchingGuitars.isEmpty()) {
			 System.out.println("Erin you might like this");
			 for(Iterator i=matchingGuitars.iterator();i.hasNext(); ) {
				 Guitar guitar=(Guitar)i.next();
		         System.out.println("We have a "+
		        		 guitar.getBuilder()+" "+guitar.getModel()+" "+guitar.getType()+
		        		   " guitar:\n "+guitar.getBackWood()+" back and sides,\n "+
		        		    guitar.getTopWood()+" top.\nYou can have it for only $"+
		        		   guitar.getPrice()+"!");
			 }
	
		 }
		 
		 else {
			 System.out.println("Sorry erin,we have nothing for you.");
		 }
	}
	 private static void initializeInventory(Inventory inventory) {
		    inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		    inventory.addGuitar("V9512", 1599.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		}

	}
