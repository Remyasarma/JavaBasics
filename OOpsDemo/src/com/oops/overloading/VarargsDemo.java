package com.oops.overloading;

public class VarargsDemo {
		
		void calcSum(String name, int...nums)
		{
			System.out.println(name);
			System.out.println(nums.length);
			int sum =0;
			for(int n :nums)
			{
				sum= sum+n;
			}
			System.out.println("Sum is "+sum);

		}
		void calcSum(String name)
		{
			System.out.println("Great day "+name);
		}
	public static void main(String... arg)
	{
		VarargsDemo demo = new VarargsDemo();
		demo.calcSum("Remya",90,80);
		demo.calcSum("Varun");
		demo.calcSum("Ram", 90,80,80);
	}

}
