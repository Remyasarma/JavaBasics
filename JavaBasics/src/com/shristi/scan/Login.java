package com.shristi.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		 String[][] stringArray = {{"Remya","abc123"},{"Ramu", "xyz123"}};
	     Scanner sc= new Scanner(System.in);
	     boolean found=false;
	     System.out.println("Enter the user name to login");
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
			 System.out.println("You are logged in scuccessfully");
		 }
		 else
		 {
			 System.out.println("Invalid username");
		 }
	     sc.close();
	}

}
