package com.shristi.basics;

public class Armstrong {

	public static void main(String[] args) {
         
		int number =153;
		int originalNumber = number;
        int result = 0;
        int n = 0;
        int temp = number;

            
        while (temp != 0) {
        temp /= 10;
        n++;
        }

        temp = number;
        
        while (temp != 0) {
        int digit = temp % 10;
        result += Math.pow(digit, n);
        temp /= 10;
        }

  
        if (result == originalNumber) {
        	System.out.println(number + " is an Armstrong number.");
        }
        else {
            System.out.println(number + " is not an Armstrong number.");
        }
   }
	
}

