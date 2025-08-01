package com.swabhav.GuitarFinal.test;

import java.util.List;

import com.swabhav.GuitarFinal.model.Builder;
import com.swabhav.GuitarFinal.model.Final_Guitar;
import com.swabhav.GuitarFinal.model.GuitarInventory;
import com.swabhav.GuitarFinal.model.GuitarSpec;
import com.swabhav.GuitarFinal.model.Type;
import com.swabhav.GuitarFinal.model.Wood;


public class Guitar {
    public static void main(String[] args) {
        GuitarInventory inventory = new GuitarInventory();


        inventory.addGuitar("123", 1500.0,
            new GuitarSpec(Builder.FENDER, "Stratocastor", 6, Type.ELECTRIC, Wood.COCOBOLO, Wood.BRAZILIAN_ROSEWOOD));
        inventory.addGuitar("124", 1600.0,
            new GuitarSpec(Builder.FENDER, "Stratocastor",  4  ,Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
        inventory.addGuitar("125", 1700.0,
            new GuitarSpec(Builder.MARTIN, "D-18", 12, Type.ACOUSTIC, Wood.MAPL, Wood.MAHOGANY));


        GuitarSpec searchSpec = new GuitarSpec(
            Builder.FENDER, "stratocastor", 8, Type.ELECTRIC, Wood.COCOBOLO, Wood.BRAZILIAN_ROSEWOOD);


        List<Final_Guitar> results = inventory.search(searchSpec);

    
        if (results.isEmpty()) {
            System.out.println("No matching guitars found.");
        } else {
            for (Final_Guitar guitar : results) {
                GuitarSpec spec = guitar.getSpec();
                System.out.println("Match found:");
                System.out.println("Serial: " + guitar.getSerialNumber());
                System.out.println("Price: " + guitar.getPrice());
                System.out.println("Number of Strings in guitar : " + guitar.getSpec().getNumStrings());
                System.out.println("Builder: " + spec.getBuilder());
                System.out.println("Model: " + spec.getModel());
                System.out.println("Type: " + spec.getType());
                System.out.println("Back Wood: " + spec.getBackwood());
                System.out.println("Top Wood: " + spec.getTopwood());
                System.out.println("-----------------------------");
            }
        }
    }
}
