package com.shristi.basics;

import java.util.Scanner;

public class UserSignIN1 {

	public static void main(String[] args) {
		 String[][] stringArray = {{"Remya","abc123"},{"Ramu", "xyz123"}};
	     Scanner sc= new Scanner(System.in);
	     boolean found=false;
	     System.out.println("Enter the user name");
	     String name =sc.next();
	     System.out.println("Enter the password");
	     String pass =sc.next();
	     for(String[] nm:stringArray)
	     {
    		 if((nm[0].equals(name))&&(nm[1].equals(pass)))
    		 {
    		 found=true;
    		 break;
    		 }
    	 }
	     if(found)
		 {
			 System.out.println("User successfully logged in");
		 }
		 else
		 {
			 System.out.println("User does not exist");
		 }
	     sc.close();
	}

}
