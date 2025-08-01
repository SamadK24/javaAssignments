package com.swabhav.AbstractFactoryPattern.model;

public class Chocolate implements IceCream {
    public void prepare() {
        System.out.println("Preparing Chocolate Ice Cream");
    }
}
