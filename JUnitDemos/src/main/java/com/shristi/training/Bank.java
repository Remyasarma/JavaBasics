package com.shristi.training;

import com.shristi.exception.InsufficientFundsException;

public class Bank {
	 private double balance;

	    public Bank(double balance) {
	        if (balance < 8000) {
	            throw new IllegalArgumentException("Minimum balance must be 8000");
	        }
	        this.balance = balance;
	    }

	    public double deposit(double amount) {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Deposit amount must be positive");
	        }
	        balance += amount;
	        return balance;
	    }

	    public double withdraw(double amount) throws InsufficientFundsException {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Withdraw amount must be positive");
	        }
	        if (balance - amount < 8000) {
	            throw new InsufficientFundsException("Cannot withdraw. Minimum balance must be 8000.");
	        }
	        balance -= amount;
	        return balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

}
