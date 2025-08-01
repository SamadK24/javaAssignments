package com.swabhav.polymorphism.model;

public class Converter {
  public void convert(double celsius) {
	System.out.println("Temperature in Fahrenheit is "+(celsius*9/5)+32);
  }
  
  public void convert(double value,String scale) {
	  if(scale.equalsIgnoreCase("celsius")) {
		  System.out.println("Temperature in Fahrenheit is "+(value*9/5)+32);
	  }
	  else {
		  System.out.println("Temperature in celsius is "+(value-32)*5/9);
	  }
  }
  
}
