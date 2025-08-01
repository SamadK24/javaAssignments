package com.swabhav.assignments.test;

public class FindLongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java is an object oriented programming language";
        findLongestWords(sentence);
    }

    public static void findLongestWords(String str) {
        str = str.trim();  

        if (str.isEmpty()) {
            System.out.println("No words found.");
            return;
        }

        String[] words = str.split("\\s+"); 
        int maxLen = 0;

       
        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
            }
        }

        
        System.out.println("Longest word(s):");
        for (String word : words) {
            if (word.length() == maxLen) {
                System.out.println(word);
            }
        }
    }
}
