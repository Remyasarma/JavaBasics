package com.shristi.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		 String[][] stringArray = {{"Remya","abc123"},{"Ramu", "xyz123"}};
	     Scanner sc= new Scanner(System.in);
	     boolean found=false;
	     System.out.println("Enter the name to register");
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
			 System.out.println("Name is not unique");
		 }
		 else
		 {
			 System.out.println("You are registered");
		 }
	     sc.close();
	}

}
