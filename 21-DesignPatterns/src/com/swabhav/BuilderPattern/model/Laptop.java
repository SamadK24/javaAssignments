package com.swabhav.BuilderPattern.model;

public class Laptop {
    private String brand;
    private int ram;
    private int ssd;
    private boolean hasGraphics;

    // Private constructor
    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.hasGraphics = builder.hasGraphics;
    }

    public void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Graphics Card: " + (hasGraphics ? "Yes" : "No"));
    }

    // Static inner builder class
    public static class LaptopBuilder {
        private String brand;
        private int ram;
        private int ssd;
        private boolean hasGraphics;

        public LaptopBuilder(String brand) {
            this.brand = brand;
        }

        public LaptopBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setSSD(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setGraphics(boolean hasGraphics) {
            this.hasGraphics = hasGraphics;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}
