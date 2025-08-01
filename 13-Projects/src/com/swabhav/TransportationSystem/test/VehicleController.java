package com.swabhav.TransportationSystem.test;

import java.util.Scanner;

import com.swabhav.TransportationSystem.model.Bike;
import com.swabhav.TransportationSystem.model.Car;
import com.swabhav.TransportationSystem.model.IVehicleControl;
import com.swabhav.TransportationSystem.model.Truck;
import com.swabhav.TransportationSystem.model.Validator;

public class VehicleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Vehicle Control System ===");

        boolean continueSimulation;

        do {
            // Step 1: Get valid vehicle type from user
            String type = Validator.getValidatedVehicleType();
            IVehicleControl vehicle = null;

            // Step 2: Initialize corresponding vehicle object
            switch (type) {
                case "car":
                    vehicle = new Car();
                    break;
                case "bike":
                    vehicle = new Bike();
                    break;
                case "truck":
                    vehicle = new Truck();
                    break;
            }

            // Step 3: Start the vehicle
            vehicle.start();

            // Step 4: Change gear
            String gear = Validator.getValidatedGear();
            vehicle.changeGear(gear);
            boolean stop = Validator.getYesNoInput("Do you want to stop the vehicle now? (yes/no): ");
            if (stop) {
                vehicle.stop();
            } else {
                System.out.println("Vehicle remains running...");
            }


            // Step 5: Stop the vehicle
//            vehicle.stop();

            // Step 6: Ask user if they want to control another vehicle
            continueSimulation = Validator.getYesNoInput("\nDo you want to control another vehicle? (yes/no): ");

        } while (continueSimulation);

        System.out.println("Thank you for using the Vehicle Control System!");
    }
}
