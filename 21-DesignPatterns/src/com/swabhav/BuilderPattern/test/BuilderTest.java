package com.swabhav.BuilderPattern.test;

import com.swabhav.BuilderPattern.model.Laptop;

public class BuilderTest {
	   public static void main(String[] args) {
	        Laptop gamingLaptop = new Laptop.LaptopBuilder("Asus")
	                                        .setRam(16)
	                                        .setSSD(512)
	                                        .setGraphics(true)
	                                        .build();

	        Laptop officeLaptop = new Laptop.LaptopBuilder("Dell")
	                                        .setRam(8)
	                                        .setSSD(256)
	                                        .build();

	        System.out.println("Gaming Laptop Specs:");
	        gamingLaptop.showSpecs();

	        System.out.println("\nOffice Laptop Specs:");
	        officeLaptop.showSpecs();
	    }
}
