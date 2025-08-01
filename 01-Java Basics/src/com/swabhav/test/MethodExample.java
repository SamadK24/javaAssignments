package com.swabhav.test;

import java.util.Scanner;

public class MethodExample {

	public static float SimpleInterest(float principal,float year,float rate) {
		float result=(principal*year*rate)/100;
		return result;
	}
	
	public static void main(String[] args) {
		float amount= SimpleInterest(2000,2f,3.5f);
		System.out.println("Simple Interest is " + amount);
	}
}
