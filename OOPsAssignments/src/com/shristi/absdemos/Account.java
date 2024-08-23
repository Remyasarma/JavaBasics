package com.shristi.absdemos;

public abstract class Account extends Bank{
	
	double balance;
	
	Account(double balance) {
		super(balance);
		this.balance = balance;
	}
	
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	double getBalance()
	{
		return balance;
	}
}
