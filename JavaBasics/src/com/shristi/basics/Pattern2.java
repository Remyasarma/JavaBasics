package com.shristi.basics;

public class Pattern2 {

	public static void main(String[] args) {
		
		int nums = 4;
		int startNum = 1; // Starting number
        for (int i = 1; i <= nums; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(startNum);
                startNum++;
            }
            System.out.print(" ");
        }
	}

}
