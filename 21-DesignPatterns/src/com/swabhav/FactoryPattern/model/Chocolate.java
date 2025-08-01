package com.swabhav.FactoryPattern.model;

public class Chocolate implements IIcecream {
    @Override
    public void prepare() {
        System.out.println("Preparing Chocolate Ice Cream");
    }
}
