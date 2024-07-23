package com.shristi.basics;

public class OneDim {

	public static void main(String[] args) {
		int[] nums = new int[4];
		System.out.println(nums.length);
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		//nums[4]=50;
		
		int sum =0;
		for(int index= 0;index<nums.length;index++) {
			int val =nums[index];
			//System.out.println(val);
			sum =sum +val;	
		}
		System.out.println(sum);
		int sumsq=0;
		for(int val:nums) {
			int square =(int)Math.pow(val,2);
			sumsq+=square;
		}
		System.out.println(sumsq);
			
	}

}
