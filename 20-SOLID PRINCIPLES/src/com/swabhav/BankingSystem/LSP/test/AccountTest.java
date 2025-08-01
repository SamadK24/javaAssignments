package com.swabhav.BankingSystem.LSP.test;

import java.util.Scanner;

import com.swabhav.BankingSystem.LSP.model.Account;
import com.swabhav.BankingSystem.LSP.model.FixedDeposit;

public class AccountTest {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("1.FixedDeposit");
	System.out.println("2.Account");
	int choice= scanner.nextInt();
	
	scanner.nextLine();
	
	switch(choice) {
	case 1:
		System.out.println("Enter the amount to be deposited");
		double deposit=scanner.nextDouble();
		FixedDeposit fd= new FixedDeposit(deposit);
		System.out.println("Amount deposited : "+fd.deposit());
		break;
		
	case 2:
		System.out.println("Enter the operation you want to perform");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		int choose=scanner.nextInt();

		if(choose==1) {
			System.out.println("Enter the amount to be deposited");
		    double amountDeposit= scanner.nextDouble();
			Account ad= new Account(amountDeposit);
			System.out.println("Amount deposited : "+ad.deposit());
			
		}
		else if(choose==2) {
			System.out.println("Enter amount to withdraw");
			double amountWithdraw=scanner.nextDouble();
			Account wd= new Account(amountWithdraw);
			System.out.println("amount withdrawed "+wd.withdraw());
			
			
		}
		else {
			System.out.println("Invalid choice");
		}
		break;
		
		default:
			System.out.println("Invalid choice");
	}
}
}
