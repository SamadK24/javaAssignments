package com.swabhav.FactoryPattern.model;

public class IceCreamFactory {

    // Factory method
    public IIcecream getIceCream(String flavor) {
        if (flavor == null) {
            return null;
        }
        if (flavor.equalsIgnoreCase("vanilla")) {
            return new Vanilla();
        } else if (flavor.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        } else if (flavor.equalsIgnoreCase("strawberry")) {
            return new Strawberry();
        } else {
            return null;
        }
    }
}
