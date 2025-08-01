package com.swabhav.polymorphism.test;

import java.util.Scanner;

import com.swabhav.polymorphism.model.Printer;

public class PrinterTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Printer printer=new Printer();
		
		printer.print();
		
		printer.print(45);
		printer.print("Hello");
		
	}
}
