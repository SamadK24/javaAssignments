package com.swabhav.model;

public class StringProcessor {

    // Check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) return false; // basic null check
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Reverse the given string
    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}

