package com.shristi.absdemos;

public abstract class Bank {
	
	double balance;

	Bank(double balance) {
		this.balance = balance;
	}
	abstract void withdraw(double amount);
	abstract  void deposit(double amount);
	double getBalance()
	{
		return balance;
	}

}
