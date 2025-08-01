package com.swabhav.calculator.SRP.test;

import java.util.Scanner;

import com.swabhav.calculator.SRP.model.Addition;
import com.swabhav.calculator.SRP.model.Division;
import com.swabhav.calculator.SRP.model.MainCalci;
import com.swabhav.calculator.SRP.model.Multiplication;
import com.swabhav.calculator.SRP.model.Subtraction;

public class CalculatorTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter num1");
	int num1=scanner.nextInt();
	
	System.out.println("Enter num2");
	int num2=scanner.nextInt();
	
	MainCalci cal= new MainCalci(num1, num2);
	
	Addition add=new Addition();
	add.Add(cal);
	
	Subtraction sub=new Subtraction();
	sub.Sub(cal);
	
	Multiplication mul=new Multiplication();
	mul.Mul(cal);
	
	Division div=new Division();
	div.Div(cal);
	
	
}
}
