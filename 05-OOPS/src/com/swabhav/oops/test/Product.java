package com.swabhav.oops.test;

import java.util.Scanner;

import com.swabhav.oops.model.ProductModel;

public class Product {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter number of products you want ");
	int size=scanner.nextInt();
	scanner.nextLine();
	
	ProductModel[] product=new ProductModel[size];
	
	for(int i=0;i<size;i++) {
		System.out.println("Enter product name");
		String productName=scanner.nextLine();
		System.out.println("Enter product price");
		double price=scanner.nextDouble();
		System.out.println("Enter product quantity");
		double quantity=scanner.nextDouble();
		scanner.nextLine();
		
		product[i]=new ProductModel(productName,price,quantity);
	}
	
	for(ProductModel result : product) {
		double total=result.claculateTotal();
		System.out.println("The total is "+total);
	}
}
}
