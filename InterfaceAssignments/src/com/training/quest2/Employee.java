package com.training.quest2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the file type 'z for zip' , 'r for rar' , 'j for jar'");
		String fileType = sc.next();
		Extractor extractor;
		if(fileType.equalsIgnoreCase("z"))
		{
			extractor = new ZipExtractor();
			extractor.extractFiles("a.txt","b.txt","c.txt");
		}
		else if(fileType.equalsIgnoreCase("r"))
		{
			extractor = new RarExtractor();
			extractor.extractFiles("a.txt","b.txt","c.txt");
		}
		else if(fileType.equalsIgnoreCase("j"))
		{
			extractor = new JarExtractor();
			extractor.extractFiles("a.txt","b.txt","c.txt");
		}

	}

}
