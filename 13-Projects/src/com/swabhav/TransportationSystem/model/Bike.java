package com.swabhav.TransportationSystem.model;

public class Bike implements IVehicleControl {
    private int currentGear = 0;

    @Override
    public void start() {
        System.out.println("Bike started.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }

    @Override
    public void changeGear(String gear) {
        switch (gear) {
            case "0":
                System.out.println("Bike is now in Neutral.");
                break;
            case "R":
                System.out.println("Bike is now in Reverse.");
                break;
            default:
                System.out.println("Bike shifted to gear " + gear);
        }
    }

}
