package com.ex.throwdemo;

public class Processor {

	void check(int x) throws Exception
	{
		System.out.println("Processing");
		try {
			if(x<10)
			{
				throw new Exception("x is greater than 10");
			}
		} catch (Exception e) {
			System.out.println("Exception occured");
			throw e;
		}
		finally
		{
			System.out.println("DB closed");
		}
		System.out.println("Completed");
		

	}

}
