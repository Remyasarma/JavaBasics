package com.threads.sync;

public class LoanCalculator {
	public double calculateInterest(String name,double amount)
	{
		System.out.println("Welcome to ABC Bank"+name);
		double interest=(amount*5*3)/100;
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
	
		}
		System.out.println("Interest for"+name+" is "+interest);
		return interest;
	}

}
