package com.swabhav.SmartHomeController.model;

public class TV extends SmartDevice {
    private static final String[] MODES = {"HD", "4K", "Game", "News"};

    public TV() {
        super("TV");
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
