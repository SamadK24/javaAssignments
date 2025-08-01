package com.swabhav.assignments.test;

public class CountNumberOfWordsInSentence {
    public static void main(String[] args) {
        String sentence = "  Hello   world! Welcome to Java.  ";
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        str = str.trim();  

        if (str.isEmpty()) {
            return 0;  
        }

        
        String[] words = str.split("\\s+");
        return words.length;
    }
}
