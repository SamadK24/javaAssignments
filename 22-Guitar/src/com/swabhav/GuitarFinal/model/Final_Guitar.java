package com.swabhav.GuitarFinal.model;

public class Final_Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Final_Guitar(String serialNumber, double price, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}


	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}
	@Override
	public String toString() {
	    return "Guitar ID: " + serialNumber +
	           ", Price: $" + price +
	           ", Builder: " + spec.getBuilder() +
	           ", Model: " + spec.getModel() +
	           ", Type: " + spec.getType() +
	           ", Back Wood: " + spec.getBackwood() +   
	           ", Top Wood: " + spec.getTopwood() +      
	           ", Strings: " + spec.getNumStrings();
	}


}
