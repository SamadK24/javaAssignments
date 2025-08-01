package com.swabhav.TransportationSystem.model;

import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getValidatedVehicleType() {
        while (true) {
            System.out.print("Enter vehicle type (Car/Bike/Truck): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("car") || input.equals("bike") || input.equals("truck")) {
                return input;
            } else {
                System.out.println("Invalid vehicle type. Try again.");
            }
        }
    }

    public static String getValidatedGear() {
        while (true) {
            System.out.print("Enter gear (0 for Neutral, 1-6 for Forward, R for Reverse): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("R") || input.equals("0") ||
                input.matches("[1-6]")) {
                return input;
            } else {
                System.out.println("Invalid gear. Please enter 0-6 or R.");
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
                System.out.println("Please enter 'yes' or 'no'.");
            }
        }
    }
}
