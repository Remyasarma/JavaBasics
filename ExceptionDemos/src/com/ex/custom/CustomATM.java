package com.ex.custom;

public class CustomATM {

	public static void main(String[] args) {
		CustomBank custombank = new CustomBank(6000);
		try {
			custombank.withdraw(7000);
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
		} catch (ExceedingLimitsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
