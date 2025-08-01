package com.swabhav.polymorphism.test;

import com.swabhav.polymorphism.model.Converter;

public class ConverterTest {
public static void main(String[] args) {
	Converter converts=new Converter();
	
	converts.convert(45);
	converts.convert(21, "celsius");
}
}
