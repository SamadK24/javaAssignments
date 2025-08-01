package com.swabhav.SingletonPattern.test;

import com.swabhav.SingletonPattern.model.Printer;

public class PrinterTest {
public static void main(String[] args) {
	Printer p1=Printer.getInstance();
	
	p1.print("Employee Salary Sheet");
    
	Printer p2=Printer.getInstance();
	p2.print("Company Brochure");
	System.out.println(p1 == p2);

}
}
