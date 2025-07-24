package com.swabhav.GuitarWithSpec.test;

import java.util.List;

import com.swabhav.GuitarWithSpec.model.Builder;
import com.swabhav.GuitarWithSpec.model.Guitar;
import com.swabhav.GuitarWithSpec.model.Guitarspec;
import com.swabhav.GuitarWithSpec.model.Inventory;
import com.swabhav.GuitarWithSpec.model.Type;
import com.swabhav.GuitarWithSpec.model.Wood;

public class GuitarMain {
	public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add guitars to inventory
        inventory.addGuitar("123", 1500.0,
                new Guitarspec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.COCOBOLO, Wood.BRAZILIAN_ROSEWOOD));
        inventory.addGuitar("124", 1600.0,
                new Guitarspec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
        inventory.addGuitar("125", 1700.0,
                new Guitarspec(Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAPL, Wood.MAHOGANY));

        // Create search spec
        Guitarspec searchspec = new Guitarspec(Builder.FENDER, "stratocastor", Type.ELECTRIC, Wood.COCOBOLO, Wood.BRAZILIAN_ROSEWOOD);

        // Search for matching guitars
        List<Guitar> results = inventory.search(searchspec);

        // Display results
        if (results.isEmpty()) {
            System.out.println("No matching guitars found.");
        } else {
            for (Guitar guitar : results) {
                Guitarspec spec = guitar.getSpec();
                System.out.println("Match found:");
                System.out.println("Serial: " + guitar.getSerialNumber());
                System.out.println("Price: " + guitar.getPrice());
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

