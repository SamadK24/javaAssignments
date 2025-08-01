package com.swabhav.AbstractFactoryPattern.model;


public class Vanilla implements IceCream {
    public void prepare() {
        System.out.println("Preparing Vanilla Ice Cream");
    }
}
