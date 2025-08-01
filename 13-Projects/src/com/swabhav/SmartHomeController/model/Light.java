package com.swabhav.SmartHomeController.model;

public class Light extends SmartDevice {
    private static final String[] MODES = {"Dim", "Bright", "Night"};

    public Light() {
        super("Light");
    }

    @Override
    public void setMode(String mode) {
        System.out.println(name + " mode set to: " + mode);
    }

    @Override
    public String[] getAvailableModes() {
        return MODES;
    }
}
