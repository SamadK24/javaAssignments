package com.swabhav.assignments.test;

public class CheckIfStringIsPalindrome {
	 public static void main(String[] args) {
	        String input = "madam"; 
	        boolean isPalindrome = checkPalindrome(input);
	        System.out.println("Is palindrome? " + isPalindrome);
	    }

	    public static boolean checkPalindrome(String str) {
	        str = str.toLowerCase(); 

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;  
	            }
	            left++;
	            right--;
	        }

	        return true;  
	    }
}
