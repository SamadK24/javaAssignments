package com.swabhav.SmartHomeController.model;

public class DeviceFactory {
    public static IControllable createDevice(String type) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light();
            case "fan":
                return new Fan();
            case "tv":
                return new TV();
            case "speaker":
                return new Speaker();
            default:
                return null;
        }
    }
}

