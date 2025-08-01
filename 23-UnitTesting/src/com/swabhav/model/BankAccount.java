package com.swabhav.model;

public class BankAccount {
 private double balance;
 
 public BankAccount(double balance) {
	this.balance=balance;
}
 public void deposit(double amount) {
	 if(amount<=0) {
		 throw new IllegalArgumentException("Amount should be greater than zero");
	 }
	  balance=balance+amount;
	 System.out.println("Amount deposited"+balance);
	 
 }
 public void withDraw(double amount) {
	 if(amount>balance) {
		 throw new IllegalArgumentException("Insufficient funds");
	 }
	 if(amount<=0) {
		 throw new IllegalArgumentException("amount must be greater than zero");
	 }
	 balance=balance-amount;
	 System.out.println("Amount deducted"+balance);
 }
 
 public double getBalance() {
	 return balance;
 }
}
