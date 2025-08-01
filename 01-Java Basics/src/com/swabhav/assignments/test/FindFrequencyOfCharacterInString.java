package com.swabhav.assignments.test;

public class FindFrequencyOfCharacterInString {
	 public static void main(String[] args) {
	        String input = "hello world";
	        countCharacterFrequency(input);
	    }

	    public static void countCharacterFrequency(String str) {
	        
	        int[] freq = new int[26];

	       
	        str = str.toLowerCase();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	           
	            if (ch >= 'a' && ch <= 'z') {
	                freq[ch - 'a']++;
	            }
	        }

	       
	        for (int i = 0; i < 26; i++) {
	            if (freq[i] > 0) {
	                char letter = (char) (i + 'a');
	                System.out.println(letter + ": " + freq[i]);
	            }
	        }
	    }
}
