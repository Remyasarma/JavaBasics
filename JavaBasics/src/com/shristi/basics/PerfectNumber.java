package com.shristi.basics;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=28;
		int i=1,sum=0;    
		while(i <= n/2)  
		{  
			if(n % i == 0)  
			{  
				sum = sum + i;  
			}   
		i++;  
		} 
		if(sum==n)  
		{  
		System.out.println(n+" is a perfect number.");  
		}  
		else  
		System.out.println(n+" is not a perfect number.");   
		}  
}

