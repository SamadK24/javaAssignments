package com.array.test;

import java.util.Scanner;

public class MaxInArray {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=scanner.nextInt();
	int[] numbers=new int[size];
	System.out.println("enter the elements");
	for(int i=0;i<numbers.length;i++) {
		numbers[i]=scanner.nextInt();
	}
	int maxElement=numbers[0];
	
}
}
