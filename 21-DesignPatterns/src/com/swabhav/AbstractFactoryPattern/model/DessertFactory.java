package com.swabhav.AbstractFactoryPattern.model;

public interface DessertFactory {
    IceCream createIceCream(String flavor);
    Cone createCone(String type);
}
