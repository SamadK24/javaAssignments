package com.swabhav.SmartHomeController.model;

public class Fan extends SmartDevice {
    private static final String[] MODES = {"High", "Medium", "Low"};

    public Fan() {
        super("Fan");
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