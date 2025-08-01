package com.swabhav.assignments.test;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "Hello world from Java";
        String result = replaceSpacesWithDash(input);
        System.out.println(result);
    }

    public static String replaceSpacesWithDash(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result += '-';  
            } else {
                result += ch;  
            }
        }

        return result;
    }
}
