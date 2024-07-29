package com.shristi.objbasics;

public class BookMain {

	public static void main(String[] args) {
		
		Book[] book= new Book[3];
		book[0]=new Book("The Jungle Book","Rudyard","Novel",450);
		book[1]=new Book("Indulekha","Chandumenon","Novel",600);
		book[2]=new Book("Oliver Twist","Charles","Novel",800);
		System.out.println("Book Details are");
		
		for(Book books:book)
		{
			books.getDetails();
			System.out.println();
		}
		
		for(Book books:book)
		{
			System.out.print(books.title+ " is ");
			books.checkBookType();
		}

	}

}
