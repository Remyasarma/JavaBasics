package com.shristi.basics;

public class SmallerInArray {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		int min =nums[0];
		
		for (int i=1;i<nums.length;i++)
		{
			if(nums[i]<min)
			{
				min= nums[i];
			}
		}
		System.out.println("Greater in the array = "+min);
	}
	
}
