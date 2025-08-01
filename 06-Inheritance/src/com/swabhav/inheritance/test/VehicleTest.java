package com.swabhav.inheritance.test;

import com.swabhav.inheritance.model.Bike;
import com.swabhav.inheritance.model.Car;

public class VehicleTest {
public static void main(String[] args) {
	Car car=new Car();
	Bike bike=new Bike();
	
	car.start();
	car.features();
	
	bike.start();
	bike.features();
}
}
