package com.shristi.basics;

public class SumAvgInArray {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		int sum=0;
		float avg=0;
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
		}
		avg=sum/nums.length;
		System.out.println("Sum of numbers in array is " +sum);
		System.out.println("Average of numbers in array is "+avg);
	}

}
