package com.swabhav.assignments.test;

import java.util.Scanner;

public class LightBillGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int meter_charge = 75;
		System.out.println("Enter the no.of units consumed");
		int units_consumed = scanner.nextInt();
		int charge=0;
		int total_water_bill = 0;
		if (units_consumed <= 100) {
			charge = units_consumed * 5;
			total_water_bill = charge + meter_charge;
//			System.out.println("Your total water bill is " + total_water_bill);
		} else if (units_consumed >= 100 && units_consumed <= 250) {
			charge = units_consumed * 10;
			total_water_bill = charge + meter_charge;
//			System.out.println("Your total water bill is " + total_water_bill);
		} else if (units_consumed >= 250) {
			charge = units_consumed * 20;
		}
		total_water_bill = charge + meter_charge;
		System.out.println("Your total water bill is " + total_water_bill);
	}
}
