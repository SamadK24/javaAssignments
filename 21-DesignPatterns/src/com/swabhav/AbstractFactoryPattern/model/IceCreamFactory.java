package com.swabhav.AbstractFactoryPattern.model;

public class IceCreamFactory implements DessertFactory {

    @Override
    public IceCream createIceCream(String flavor) {
        if (flavor.equalsIgnoreCase("vanilla")) {
            return new Vanilla();
        } else if (flavor.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        }
        return null;
    }

    @Override
    public Cone createCone(String type) {
        return null; // IceCreamFactory doesn't make cones
    }
}
