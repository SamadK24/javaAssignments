package com.swabhav.FactoryPattern.model;

public class Vanilla implements IIcecream {
    @Override
    public void prepare() {
        System.out.println("Preparing Vanilla Ice Cream");
    }
}
