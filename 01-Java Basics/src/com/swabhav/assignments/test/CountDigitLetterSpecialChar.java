package com.swabhav.assignments.test;

public class CountDigitLetterSpecialChar {
	   public static void main(String[] args) {
	        String input = "Hello123@# World!";

	        countCharacterTypes(input);
	    }

	    public static void countCharacterTypes(String str) {
	        int letters = 0;
	        int digits = 0;
	        int specialChars = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else if (!Character.isWhitespace(ch)) {
	                specialChars++;  
	            }
	        }

	        System.out.println("Letters: " + letters);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special Characters: " + specialChars);
	    }
}
