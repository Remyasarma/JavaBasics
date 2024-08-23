package com.shristi.abst;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Branch 1 car loan");
	}

	@Override
	void HouseLoan() {
		System.out.println("Branch 1 House loan");

	}

	@Override
	void educationLoan() {
		System.out.println("Branch 1 education loan");

	}

	void payLoan() {
		System.out.println("Branch1 Pay Loan");
	}

}
