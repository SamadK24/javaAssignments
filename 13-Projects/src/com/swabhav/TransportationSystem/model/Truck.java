package com.swabhav.TransportationSystem.model;

public class Truck implements IVehicleControl {
    private int currentGear = 0;

    @Override
    public void start() {
        System.out.println("Truck roared to life.");
    }

    @Override
    public void stop() {
        System.out.println("Truck halted.");
    }

    @Override
    public void changeGear(String gear) {
        switch (gear) {
            case "0":
                System.out.println("Truck is now in Neutral.");
                break;
            case "R":
                System.out.println("Truck is now in Reverse.");
                break;
            default:
                System.out.println("Truck is now in gear " + gear);
        }
    }

}
