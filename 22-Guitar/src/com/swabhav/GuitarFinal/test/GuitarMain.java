package com.swabhav.GuitarFinal.test;

import com.swabhav.GuitarFinal.model.*;
import java.util.*;

public class GuitarMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuitarInventory inventory = new GuitarInventory();
        preloadInventory(inventory);

        while (true) {
            System.out.println("\nSelect your role:");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int roleChoice = getValidNumberInput(1, 3);

            switch (roleChoice) {
                case 1:
                    adminMenu(inventory);
                    break;
                case 2:
                    userMenu(inventory);
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    return;
            }
        }
    }
    
    private static void preloadInventory(GuitarInventory inventory) {
        inventory.addGuitar(new Final_Guitar("S1", 1500.0,
            new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6)));
        inventory.addGuitar(new Final_Guitar("S2", 1200.0,
            new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE, 6)));
        inventory.addGuitar(new Final_Guitar("S3", 1000.0,
            new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.ROSEWOOD, Wood.SPRUCE, 6)));
    }

    private static void runApplication(GuitarInventory inventory) {
        while (true) {
            System.out.println("\n=== Welcome to Guitar Inventory System ===");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Enter your role (1-Admin, 2-User, 3-Exit): ");

            int choice = getValidNumberInput(1, 3);
            switch (choice) {
                case 1:
                    adminMenu(inventory);
                    break;
                case 2:
                    userMenu(inventory);
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
            }
        }
    }

    private static void adminMenu(GuitarInventory inventory) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Guitar");
            System.out.println("2. View Inventory");
            System.out.println("3. Delete Guitar by Serial Number");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = getValidNumberInput(1, 4);

            switch (choice) {
                case 1:
                    addGuitar(inventory);
                    break;
                case 2:
                    viewInventory(inventory);
                    break;
                case 3:
                    deleteGuitar(inventory);
                    break;
                case 4:
                    return;
            }
        }
    }
    
    private static void deleteGuitar(GuitarInventory inventory) {
        System.out.print("Enter the Serial Number of the guitar to delete: ");
        String serialNumber = scanner.nextLine().trim();

        boolean deleted = inventory.deleteGuitarBySerial(serialNumber);
        if (deleted) {
            System.out.println("Guitar with serial number '" + serialNumber + "' deleted successfully.");
        } else {
            System.out.println("No guitar found with serial number '" + serialNumber + "'.");
        }
    }

    private static void userMenu(GuitarInventory inventory) {
        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Search Guitar (Strict Match)");
            System.out.println("2. Search Guitar (Flexible Match)");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = getValidNumberInput(1, 3);

            switch (choice) {
                case 1:
                    searchGuitar(inventory, false);
                    break;
                case 2:
                    searchGuitar(inventory, true);
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void addGuitar(GuitarInventory inventory) {
        System.out.print("Enter Serial Number (e.g., SN1234): ");
        String serialNumber = scanner.nextLine().trim();

        double price;
        while (true) {
            System.out.print("Enter Price (e.g., 999.99): ");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price >= 0) break;
                System.out.println("Price cannot be negative.");
            } catch (Exception e) {
                System.out.println("Invalid number. Try again.");
            }
        }

        GuitarSpec spec = getGuitarSpecFromUser();
        inventory.addGuitar(new Final_Guitar(serialNumber, price, spec));
        System.out.println("Guitar added successfully.");
    }

    private static void viewInventory(GuitarInventory inventory) {
        List<Final_Guitar> guitars = inventory.getAllGuitars();
        System.out.println("\n=== Guitar Inventory ===");
        if (guitars.isEmpty()) {
            System.out.println("No guitars in inventory.");
        } else {
            guitars.forEach(System.out::println);
        }
    }

    private static void searchGuitar(GuitarInventory inventory, boolean isFlexible) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Filter-Based Search ---");
        System.out.println("Enter guitar specifications to search (press Enter to skip in flexible mode):");

        GuitarSpec searchSpec = isFlexible ? getGuitarSpecFromUserFlexible() : getGuitarSpecFromUser();

        List<Final_Guitar> matches = isFlexible ?
            inventory.flexibleSearch(searchSpec) : inventory.search(searchSpec);

        if (isFlexible) {
            System.out.println("\nApplied Filters:");
            if (searchSpec.getBuilder() != null) System.out.println("Builder: " + searchSpec.getBuilder());
            if (searchSpec.getModel() != null && !searchSpec.getModel().trim().isEmpty()) System.out.println("Model: " + searchSpec.getModel());
            if (searchSpec.getType() != null) System.out.println("Type: " + searchSpec.getType());
            if (searchSpec.getBackwood() != null) System.out.println("Backwood: " + searchSpec.getBackwood());
            if (searchSpec.getTopwood() != null) System.out.println("Topwood: " + searchSpec.getTopwood());
            if (searchSpec.getNumStrings() > 0) System.out.println("Number of Strings: " + searchSpec.getNumStrings());
        }

        System.out.println("\n=== Search Results ===");
        if (matches.isEmpty()) {
            System.out.println("No matching guitars found.");

            if (isFlexible) {
                System.out.print("\nWould you like to search again? (Y/N): ");
                String choice = sc.nextLine().trim();
                while (choice.isEmpty()) {
                    choice = sc.nextLine().trim();
                }
                if (choice.equalsIgnoreCase("Y")) {
                    searchGuitar(inventory, true);
                }
            }

        } else {
            matches.forEach(System.out::println);
        }
    }



    private static GuitarSpec getGuitarSpecFromUser() {
        Builder builder = getEnumInput("Choose Builder", Builder.values());
        System.out.print("Enter Model (e.g., Stratocaster): ");
        String model = scanner.nextLine().trim();
        Type type = getEnumInput("Choose Type", Type.values());
        int numStrings = getIntInputWithDefault("Enter Number of Strings (e.g., 6)", 6);
        Wood backWood = getEnumInput("Choose Back Wood", Wood.values());
        Wood topWood = getEnumInput("Choose Top Wood", Wood.values());

        return new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
    }

    private static <T extends Enum<T>> T getEnumInput(String prompt, T[] values) {
        while (true) {
            System.out.println(prompt + ":");
            for (int i = 0; i < values.length; i++) {
                System.out.println((i + 1) + ". " + values[i]);
            }
            System.out.print("Enter choice (1-" + values.length + "): ");
            int choice = getValidNumberInput(1, values.length);
            return values[choice - 1];
        }
    }

    private static int getValidNumberInput(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) return input;
                System.out.print("Enter a number between " + min + " and " + max + ": ");
            } catch (Exception e) {
                System.out.print("Invalid input. Try again: ");
            }
        }
    }

    private static int getIntInputWithDefault(String prompt, int defaultVal) {
        System.out.print(prompt + " (Press Enter for default " + defaultVal + "): ");
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) return defaultVal;
        try {
            int val = Integer.parseInt(input);
            return Math.max(1, val); 
        } catch (Exception e) {
            System.out.println("Invalid input, using default.");
            return defaultVal;
        }
    }
    
    private static <T extends Enum<T>> T getEnumInputOptional(String prompt, T[] values) {
        while (true) {
            System.out.println(prompt + " (Press Enter to skip):");
            for (int i = 0; i < values.length; i++) {
                System.out.println((i + 1) + ". " + values[i]);
            }
            System.out.print("Enter choice (1-" + values.length + " or press Enter to skip): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) return null;

            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= values.length) {
                    return values[choice - 1];
                } else {
                    System.out.println("Please enter a number between 1 and " + values.length + ", or press Enter to skip.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number or press Enter to skip.");
            }
        }
    }
    private static GuitarSpec getGuitarSpecFromUserFlexible() {
        Builder builder = getEnumInputOptional("Choose Builder", Builder.values());
        System.out.print("Enter Model (e.g., Stratocaster, or press Enter to skip): ");
        String model = scanner.nextLine().trim();
        if (model.isEmpty()) model = null;

        Type type = getEnumInputOptional("Choose Type", Type.values());
        Integer numStrings = getIntInputOptional("Enter Number of Strings (or press Enter to skip): ");
        Wood backWood = getEnumInputOptional("Choose Back Wood", Wood.values());
        Wood topWood = getEnumInputOptional("Choose Top Wood", Wood.values());

        return new GuitarSpec(builder, model, type, backWood, topWood, numStrings != null ? numStrings : -1);
    }
    private static Integer getIntInputOptional(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) return null;

        try {
            int value = Integer.parseInt(input);
            return Math.max(1, value); 
        } catch (Exception e) {
            System.out.println("Invalid input. Skipping this field.");
            return null;
        }
    }



}
