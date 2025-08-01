package com.swabhav.FactoryPattern.model;

public class Strawberry implements IIcecream {
    @Override
    public void prepare() {
        System.out.println("Preparing Strawberry Ice Cream");
    }
}
