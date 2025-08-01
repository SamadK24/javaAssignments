package com.swabhav.SmartHomeController.model;

import java.util.Scanner;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static final String getValidatedDeviceType() {
        while (true) {
            try {
                System.out.print("Enter device type (Light/Fan/TV/Speaker): ");
                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("light") || input.equalsIgnoreCase("fan") ||
                    input.equalsIgnoreCase("tv") || input.equalsIgnoreCase("speaker")) {
                    return input;
                } else {
                    throw new IllegalArgumentException("Invalid device type.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Validation attempt completed.");
            }
        }
    }

    public static int getValidatedInt(String message) throws NumberFormatException {
        System.out.print(message);
        String input = scanner.nextLine();
        return Integer.parseInt(input); // uses Integer wrapper
    }
}
