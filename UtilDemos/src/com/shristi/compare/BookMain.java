package com.shristi.compare;

import java.util.Arrays;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		List<Book> book = Arrays.asList(
				new Book("Java","Kathy",2000),
				new Book("C","ABC",2000),
				new Book("Python","xyz",2000),
				new Book("System design","mno",2000),
				new Book("computer","lmn",2000)
				);
		System.out.println(book);
		
	}

}
