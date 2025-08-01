package com.swabhav.exceptionHandling.model;

public class AgeException extends RuntimeException {
  
	public AgeException() {
		System.out.println("under age");
	}
	
	public AgeException(String message) {
		super(message);
	}
}
