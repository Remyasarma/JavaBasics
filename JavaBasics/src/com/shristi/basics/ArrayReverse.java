package com.shristi.basics;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] nums= {20,40,30,10,50};
		
		System.out.println("Array before reversing");
        for (int num : nums) {
            System.out.print(num + " ");
        }
		int left = 0;
        int right = nums.length - 1;
        
        while (left < right) 
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
        System.out.println();
        System.out.println("Reversed array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

	}

}
