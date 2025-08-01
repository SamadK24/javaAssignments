package com.swabhav.ExamSystem.model;

import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getValidatedExamType() {
        while (true) {
            System.out.print("Enter exam type (Theory/Practical/Online): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("theory") || input.equals("practical") || input.equals("online")) {
                return input;
            } else {
                System.out.println("Invalid exam type. Try again.");
            }
        }
    }

    public static double getValidatedMarks() {
        while (true) {
            System.out.print("Enter marks (0-100): ");
            String input = scanner.nextLine().trim();
            try {
                double marks = Double.parseDouble(input);
                if (marks < 0 || marks > 100) {
                    System.out.println("Marks must be between 0 and 100.");
                } else {
                    return marks;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric marks.");
            }
        }
    }

    public static boolean getYesNoInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("yes") || input.equals("y")) {
                return true;
            } else if (input.equals("no") || input.equals("n")) {
                return false;
            } else {
                System.out.println("Please answer with 'yes' or 'no'.");
            }
        }
    }
}
