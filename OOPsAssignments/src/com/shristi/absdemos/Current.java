package com.shristi.absdemos;

public class Current extends Account {
	double overdraft_limit = 1000;
	double deposit_fee_percent = 0.01;

	Current(double balance) {
		super(balance);

	}

	@Override
	void withdraw(double amount) {
		if (balance - amount >= -overdraft_limit) {
			balance = balance - amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Insufficient funds. Overdraft limit exceeded.");
		}
	}

	@Override
	void deposit(double amount) {
		double fee = amount * deposit_fee_percent;
		balance = balance + amount - fee;
		System.out.println("Deposit successful with fee. New balance: " + balance);
	}
}
