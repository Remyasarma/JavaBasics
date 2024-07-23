package com.shristi.basics;

public class ArrayAscend {

	public static void main(String[] args) {
		int[] nums= {20,40,30,10,50};
		int temp;
		
		System.out.println("Array before sorting");
		for (int num : nums)
		{
            System.out.print(num + " ");
	    }
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					temp= nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending Array");
		for (int num : nums)
		{
            System.out.print(num + " ");
	    }
	}
}
