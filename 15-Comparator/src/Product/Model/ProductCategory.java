package com.swabhav.Product.Model;

public class ProductCategory {
	String category;
	String name ;
	double price;

	public ProductCategory(String category, String name, double price) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
	}


	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "[category= " + category + ", name= " + name + ", price= " + price + "]";
	}
	
}