package com.swabhav.Product.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.swabhav.Product.Model.PriceAsc;
import com.swabhav.Product.Model.ProductCategory;

public class ProductCatePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<ProductCategory> product = new ArrayList<ProductCategory>();
		int numberProduct ;
//user input for product quantity
		while(true) {
			try {
				System.out.println("Enter the number of product ");
				numberProduct = scanner.nextInt();
				scanner.nextLine();
				
				if(numberProduct <= 0) {
					System.out.println("Product size must be greater then '0' ");
				}
				else {
					break;
				}
			} catch (InputMismatchException i) {
				System.out.println("Enter valid number ! No String Please !");
				scanner.nextLine();
			}
		}
		
		for(int i=0 ; i<numberProduct ; i++) {
			 System.out.println("\nProduct #" + (i + 1));
			 String category="";
			 String name ="";
			 double price;
			 scanner.nextLine();
			 
//user input for category 
			while(true) {
				try {
					System.out.println("Enter product Category name : ");
					category = scanner.nextLine().trim();
					
					if(category.isEmpty() || !category.matches("[a-zA-z]+")) {
						System.out.println("No Empty space ! Only Letter in category ");
					}
					else {
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid Input type !");
					scanner.nextLine();
				}
			}
			
//user input for product name 
			while(true) {
				try {
					System.out.println("Enter product name : ");
					name = scanner.nextLine().trim();
					
					if(name.isEmpty() || !name.matches("[a-zA-z0-9]+")) {
						System.out.println("Only AlphaNumeric !! no empty");
					}
					else {
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid Input type !");
					scanner.nextLine();
				}
			}
			
//price input
			while(true) {
				try {
					System.out.println("Enter product price : ");
					price = scanner.nextDouble();
					
					if(price<= 0) {
						System.out.println("Enter positive value");
					}
					else {
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid Input type ! enter valid number");
					scanner.nextLine();
				}
			}
			
			product.add(new ProductCategory(category , name , price));
		}
		
		Collections.sort(product ,new PriceAsc());
		
		for(ProductCategory p : product) {
			System.out.println(p);
		}
		scanner.close();
	}
}
