package com.swabhav.twodarray.test;

import java.util.Scanner;

public class SumOfEachRowAndColumn {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	int[][] matrix=new int[3][3];
	
	System.out.println("Enter the elemnts of matrix");
	
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			matrix[i][j]=scanner.nextInt();
		}
	}
	
	
	
	
    for(int i=0;i<3;i++) {
    	int rowSum=0;
		for(int j=0;j<3;j++) {
			rowSum=rowSum+matrix[i][j];
		}
		System.out.println("Sum of row "+ rowSum);
	}
    for(int j=0;j<3;j++) {
    	int columnSum=0;
		for(int i=0;i<3;i++) {
			columnSum=columnSum+matrix[i][j];
		}
		System.out.println("Sum of column "+ columnSum);
	}
    
	
	
	
}
}
