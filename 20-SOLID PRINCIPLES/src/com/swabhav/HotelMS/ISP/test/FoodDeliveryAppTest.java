package com.swabhav.HotelMS.ISP.test;

import java.util.Scanner;

import com.swabhav.HotelMS.ISP.model.Customer;
import com.swabhav.HotelMS.ISP.model.Manager;

public class FoodDeliveryAppTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("1.Customer");
	System.out.println("2.Manager");
	int choice=scanner.nextInt();
	
	if(choice==1) {
		Customer customer=new Customer();
		customer.placeOrder();
		customer.trackOrder();
		System.out.println("how much would you rate");
		int rating=scanner.nextInt();
		Customer customer1=new Customer(rating);
		System.out.println("Driver rating "+customer1.rateDriver());
	}
	else if(choice==2) {
		Manager m=new Manager();
		m.manageRestaurant();
	}
}
}
