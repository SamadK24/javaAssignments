package com.swabhav.consumer.test;

import java.util.function.Function;

public class StringLengthFunction {
	 public static void main(String[] args) {
	        // Function to return the length of a string
	        Function<String, Integer> getLength = str -> str.length();

	        // Sample names
	        String[] names = {"Samad", "Riya", "Alexander"};

	        // Apply the function to each name and print the result
	        for (String name : names) {
	            int length = getLength.apply(name);
	            System.out.println("Length of \"" + name + "\" is: " + length);
	        }
	    }
}
