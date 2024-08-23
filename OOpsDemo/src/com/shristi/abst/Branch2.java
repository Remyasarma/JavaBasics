package com.shristi.abst;

public abstract class Branch2 extends Bank {

	@Override
	void HouseLoan() {
		System.out.println("Branch 2 house loan");

	}

	@Override
	void educationLoan() {
		System.out.println("Branch 2 education loan");

	}

	void showBills() {
		System.out.println("Branch2 show bills");
	}
}
