package com.swabhav.polymorphism.model;

public class VolumeCalculator {

	 public void volume(int side) {
		 System.out.println("Volume of cube is "+side*side*side);
	 }
	 public void volume(int length,int breadth,int height) {
		 System.out.println("Volume of cuboid is "+length*breadth*height);
	 }
	 public void volume(double radius) {
		 System.out.println("Volume of sphere is "+(4/3*3.14*radius*radius*radius));
	 }
}
