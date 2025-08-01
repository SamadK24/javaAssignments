package com.swabhav.polymorphism.model;

public class Printer {
  
	public void print() {
		System.out.println("Default message");
	}
	
	public void print(String msg) {
		System.out.println("the message is "+msg);
	}
	
	public void print(int number) {
		System.out.println("the number is "+number);
	}
}
