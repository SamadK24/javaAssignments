package com.swabhav.SmartHomeController.model;

public abstract class SmartDevice implements IControllable {
    protected String name;
    protected boolean powerStatus;

    public SmartDevice(String name) {
        this.name = name;
        this.powerStatus = false;
    }

    @Override
    public void turnOn() {
        powerStatus = true;
        System.out.println(name + " turned ON");
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println(name + " turned OFF");
    }

    // Abstract method for device-specific mode
    public abstract void setMode(String mode);
}
