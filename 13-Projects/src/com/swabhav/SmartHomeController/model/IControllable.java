package com.swabhav.SmartHomeController.model;

public interface IControllable {
    void turnOn();
    void turnOff();
    void setMode(String mode);
    String[] getAvailableModes();
}
