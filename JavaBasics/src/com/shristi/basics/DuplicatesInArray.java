package com.shristi.basics;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] nums= {10,20,20,40,50};
		boolean hasDuplicates = false;

        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate element found: " + nums[i]);
                    hasDuplicates = true;
                    break;
                }
            }
        }
        if (!hasDuplicates) 
        {
            System.out.println("No duplicates found.");
        }
	}

}
