package com.swabhav.assignments.test;

public class RemoveDuplicatesCharFromString {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicateChars(input);
        System.out.println("After removing duplicates: " + result);
    }

    public static String removeDuplicateChars(String str) {
        String result = "";
        boolean[] seen = new boolean[256];  

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!seen[ch]) {
                result += ch;      
                seen[ch] = true;  
            }
        }

        return result;
    }
}
