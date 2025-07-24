package com.swabhav.GuitarWithSpec.model;

public class Guitar {
	private String serialNumber;
	private double price;
	private Guitarspec spec;

	public Guitar(String serialNumber, double price, Guitarspec spec) {
		super();
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

	public Guitarspec getSpec() {
		return spec;
	}
}
