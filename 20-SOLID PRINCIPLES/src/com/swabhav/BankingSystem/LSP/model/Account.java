package com.swabhav.BankingSystem.LSP.model;

public class Account implements IDeposit,IWithdraw {
  double amount;
  
  public Account(double amount) {
	  this.amount=amount;
  }
	
	
	@Override
	public double withdraw() {
		
		return amount;
	}

	@Override
	public double deposit() {
	
		return amount;
	}

}
