package com.swabhav.ClaimProcessor.OCP.test;

import java.util.Scanner;

import com.swabhav.ClaimProcessor.OCP.model.HealthInsurance;
import com.swabhav.ClaimProcessor.OCP.model.LifeInsurance;
import com.swabhav.ClaimProcessor.OCP.model.PropertyInsurance;
import com.swabhav.ClaimProcessor.OCP.model.VehicleInsurance;

public class ClaimTest {
public static void main(String[] args) {
	getType get = new getType();
	

	

	Scanner scanner = new Scanner(System.in);
	boolean isExit = false;
	while (!isExit) {
		System.out.println("Enter the claim type \n1.Life\n2.Health\n3.Property\n4.Vehicle\n5.exit");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			get.getType(new LifeInsurance());
			break;
		case 2:
			get.getType(new HealthInsurance());
			break;
			
		case 3:
			get.getType(new PropertyInsurance());
			break;
			
		case 4:
			get.getType(new VehicleInsurance());
			break;
			
		case 5:
			System.out.println("theank u");
			isExit=true;
			break;
		default:
			break;
		}

	}
}
}
