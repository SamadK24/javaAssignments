package com.swabhav.HotelMS.ISP.model;

public class Customer implements ICustomerOps {
    float rating;
    
    public Customer(int rating) {
    	this.rating=rating;
    }
    
    public Customer() {
    	
    }
	@Override
	public void placeOrder() {
		System.out.println("Order placed");
		
	}

	@Override
	public float rateDriver() {
		return rating;
		
	}

	@Override
	public void trackOrder() {
		System.out.println("Order on the way");
		
	}

}
