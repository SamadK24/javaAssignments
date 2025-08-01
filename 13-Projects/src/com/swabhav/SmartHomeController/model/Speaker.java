package com.swabhav.SmartHomeController.model;

public class Speaker extends SmartDevice {
    private static final String[] MODES = {"Bass", "Treble", "Surround", "Flat"};

    public Speaker() {
        super("Speaker");
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
