package com.ex.custom;

public class CustomBank {
	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) throws ExceedingLimitsException,ExceedingLimitsException,Exception
	{
		if(amount>1000) {
			throw new ExceedingLimitsException("amount should be less than balance");
		}
		if(balance-amount<0) {
			throw new NegativeBalanceException("balance should be negative");
		}
		balance=balance-amount;
		System.out.println("Balance "+balance);
			
	}

}
