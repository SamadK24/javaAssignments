package com.swabhav.consumer.test;

import java.util.function.Supplier;

public class CitySupplier {
	public static void main(String[] args) {
        // Simulate user input (null or "")
        String userInput = "";  // Try changing to null, "", or "Mumbai"

        // Supplier for default city
        Supplier<String> defaultCity = () -> "Pune";

        // Use fallback if input is null or empty
        String finalCity = (userInput == null || userInput.trim().isEmpty())
                           ? defaultCity.get()
                           : userInput;

        System.out.println("Selected city: " + finalCity);
    }
}
