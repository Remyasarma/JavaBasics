package com.shristi.abst;

public class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("Subbranch car loan");

	}

	void showEMIOptions() {
		System.out.println("Subbranch EMI options");
	}
}
