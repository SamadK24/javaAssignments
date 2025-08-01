package com.array.test;

import java.util.Scanner;

public class ReadingAndDisplayingArrayElements {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter size of an array");
	int size=scanner.nextInt();
	
	int[] numbers=new int[size];
	
	System.out.println("Enter the elemnts in an array");
	for(int i=0;i<numbers.length;i++) {
		numbers[i]=scanner.nextInt();
	}
	System.out.println("You've entered");
	for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}
			
}
}
