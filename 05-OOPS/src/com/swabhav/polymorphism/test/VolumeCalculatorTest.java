package com.swabhav.polymorphism.test;

import com.swabhav.polymorphism.model.VolumeCalculator;

public class VolumeCalculatorTest {
public static void main(String[] args) {
	VolumeCalculator result=new VolumeCalculator();
	
	result.volume(4.5);
	result.volume(5);
	result.volume(3, 4, 5);
}
}
