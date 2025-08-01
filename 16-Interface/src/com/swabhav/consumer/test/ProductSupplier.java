package com.swabhav.consumer.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ProductSupplier {
	 public static void main(String[] args) {
	        // Supplier that returns a list of 5 default product names
	        Supplier<List<String>> productSupplier = () -> Arrays.asList(
	            "Laptop", "Smartphone", "Headphones", "Keyboard", "Monitor"
	        );

	        // Get the product list from the supplier
	        List<String> products = productSupplier.get();

	        // Print each product using a loop
	        System.out.println("Available Products:");
	        for (String product : products) {
	            System.out.println("- " + product);
	        }
	    }
}
