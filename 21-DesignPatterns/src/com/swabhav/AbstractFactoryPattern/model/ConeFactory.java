package com.swabhav.AbstractFactoryPattern.model;


public class ConeFactory implements DessertFactory {

    @Override
    public IceCream createIceCream(String flavor) {
        return null; // ConeFactory doesn't make ice creams
    }

    @Override
    public Cone createCone(String type) {
        if (type.equalsIgnoreCase("waffle")) {
            return new WaffleCone();
        } else if (type.equalsIgnoreCase("sugar")) {
            return new SugarCone();
        }
        return null;
    }
}
