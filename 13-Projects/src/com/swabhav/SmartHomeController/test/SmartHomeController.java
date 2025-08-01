package com.swabhav.SmartHomeController.test;

import java.util.Scanner;

import com.swabhav.SmartHomeController.model.DeviceFactory;
import com.swabhav.SmartHomeController.model.IControllable;
import com.swabhav.SmartHomeController.model.Validator;

public class SmartHomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDevices;

        // Step 1: Validated input for number of devices
        while (true) {
            try {
                System.out.print("How many devices do you want to configure? ");
                String input = scanner.nextLine().trim();
                numDevices = Integer.parseInt(input);
                if (numDevices <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again (e.g., 1, 2, 3...).");
            }
        }

        IControllable[] devices = new IControllable[numDevices];

        // Step 2: Configure each device
        for (int i = 0; i < numDevices; i++) {
            System.out.println("\n--- Device " + (i + 1) + " ---");

            String type;
            IControllable device = null;

            // Get a valid device type
            while (device == null) {
                type = Validator.getValidatedDeviceType();
                device = DeviceFactory.createDevice(type);
                if (device == null) {
                    System.out.println("Error creating device. Try again.");
                }
            }

            devices[i] = device;

            // Ask user if they want to turn ON the device
            boolean isTurnedOn = false;
            if (getYesNoInput(scanner, "Do you want to turn ON this " + device.getClass().getSimpleName() + "? (yes/no): ")) {
                device.turnOn();
                isTurnedOn = true;

             // Show available modes and get choice
                String[] modes = device.getAvailableModes();
                System.out.println("Select a mode:");

                for (int j = 0; j < modes.length; j++) {
                    System.out.println((j + 1) + ". " + modes[j]);
                }

                int modeChoice = -1;
                while (true) {
                    try {
                        System.out.print("Enter choice (1 to " + modes.length + "): ");
                        String choiceInput = scanner.nextLine().trim();
                        modeChoice = Integer.parseInt(choiceInput);
                        if (modeChoice >= 1 && modeChoice <= modes.length) {
                            break;
                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Enter a number.");
                    }
                }

                String selectedMode = modes[modeChoice - 1];
                device.setMode(selectedMode);
            } else {
                System.out.println(device.getClass().getSimpleName() + " remains OFF.");
            }

            // Ask to turn OFF only if it was turned ON
            if (isTurnedOn) {
                if (getYesNoInput(scanner, "Do you want to turn OFF this device now? (yes/no): ")) {
                    device.turnOff();
                } else {
                    System.out.println("Device left ON.");
                }
            } else {
                System.out.println("Skipping OFF action (device was never turned ON).");
            }
        }

        System.out.println("\n=== Simulation Complete ===");
    }

    // Helper method to get strict yes/no input
    private static boolean getYesNoInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes") || response.equals("y")) {
                return true;
            } else if (response.equals("no") || response.equals("n")) {
                return false;
            } else {
                System.out.println("Please enter 'yes' or 'no'.");
            }
        }
    }
}
