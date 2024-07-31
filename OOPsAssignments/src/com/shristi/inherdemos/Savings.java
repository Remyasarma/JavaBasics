package com.shristi.inherdemos;

public class Savings extends Account {

	double min_balance = 500;
	double deposit_bonus = 0.02;

	Savings(double balance) {
		super(balance);

	}

	@Override
	void withdraw(double amount) {
		if (balance - amount >= min_balance) {
			balance = balance - amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Insufficient funds. Minimum balance must be maintained.");
		}
	}

	@Override
	void deposit(double amount) {
		double bonus = amount * deposit_bonus;
		balance = balance + amount + bonus;
		System.out.println("Deposit successful with bonus. New balance: " + balance);
	}
}
