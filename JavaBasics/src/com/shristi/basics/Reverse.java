package com.shristi.basics;

public class Reverse {

	public static void main(String[] args) {
		
		int number =123;
		int revNumber = 0;
        int orgNumber = number;

        while (number != 0) 
        {
            int digit = number % 10;
            revNumber = revNumber * 10 + digit;
            number =number/ 10;
        }
        System.out.println("Reversed number: " + revNumber);

	}

}
