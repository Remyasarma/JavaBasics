package com.shristi.basics;

public class GreaterInArray {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		int max =nums[0];
		
		for (int i=1;i<nums.length;i++)
		{
			if(nums[i]>max)
			{
				max= nums[i];
			}
		}
		System.out.println("Greater in the array = "+max);
		
		
	}

}
