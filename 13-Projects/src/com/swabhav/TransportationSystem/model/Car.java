package com.swabhav.TransportationSystem.model;
public class Car implements IVehicleControl {
    private int currentGear = 0;

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void changeGear(String gear) {
        switch (gear) {
            case "0":
                System.out.println("Car is now in Neutral.");
                break;
            case "R":
                System.out.println("Car is now in Reverse.");
                break;
            default:
                System.out.println("Car changed to gear " + gear);
        }
    }

}