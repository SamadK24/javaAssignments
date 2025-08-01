package com.swabhav.assignments.test;

import java.util.Arrays;

public class CheckIfAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = checkAnagram(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
    }

    public static boolean checkAnagram(String s1, String s2) {
        
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

       
        if (s1.length() != s2.length()) {
            return false;
        }

      
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
