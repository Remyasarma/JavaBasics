package com.shristi.training;

import java.util.List;

public interface IBookDetails {

	//properlist or empty or null or throw exception
	List<Book> findByAuthor(String author);
	// 
	void addBook(Book book);
	//return one book,null or throw exceptions
	Book findById(int bookId);
	//return the expected result or null or exception
	String greetUser(String message);

}
