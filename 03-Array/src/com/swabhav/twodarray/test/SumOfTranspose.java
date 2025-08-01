package com.swabhav.twodarray.test;

import java.util.Scanner;

public class SumOfTranspose {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	
	
	int[][] matrix=new int[3][3];
	
	System.out.println("enter the elemnts");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			matrix[i][j]=scanner.nextInt();
		}
	}
	
	System.out.println("transpose of matrix is");
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
			System.out.print(" "+matrix[j][i]);
		}
		System.out.println();
	}
	
}
}
