package com.swabhav.consumer.test;

import java.util.function.Function;

public class CelsiusToFahrenheit {
	 public static void main(String[] args) {
	        // Function to convert Celsius to Fahrenheit
	        Function<Double, Double> cToF = celsius -> (celsius * 9 / 5) + 32;

	        // Celsius values to convert
	        double[] celsiusValues = {0.0, 20.0, 37.0};

	        // Convert and print results
	        for (double c : celsiusValues) {
	            double f = cToF.apply(c);
	            System.out.println(c + "°C = " + f + "°F");
	        }
	    }
}
