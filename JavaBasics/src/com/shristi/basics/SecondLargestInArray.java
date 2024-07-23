package com.shristi.basics;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		int temp;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1+1;j<nums.length;j++)
			{
				if(nums[i]<nums[j])
				{
					temp= nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("Second Largest number in the array = " +nums[1]);


	}

}
