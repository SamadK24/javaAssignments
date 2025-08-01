package com.swabhav.BankingSystem.LSP.model;

public class FixedDeposit implements IDeposit {
   double amount;

	public FixedDeposit(double amount) {
		this.amount = amount;
	}

	@Override
	public double deposit() {
		return amount;
	}

}
