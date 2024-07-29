package com.shristi.objbasics;

public class Book {
	
	String title, author, category;
	double price;
	Book(String title, String author, String category, double price)
	{
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	void getDetails()
	{
		System.out.println("Book Name : "+title);
		System.out.println("Book Author : "+author);
		System.out.println("Book Category : "+category);
		System.out.println("Book Price : "+price);
	}
	
	void checkBookType()
	{
		if(price>500)
		{
			System.out.println("Premium Book");
		}
		else
		{
			System.out.println("Standard Book");
		}
	}

}
