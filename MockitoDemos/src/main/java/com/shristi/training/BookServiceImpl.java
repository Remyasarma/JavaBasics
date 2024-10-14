package com.shristi.training;

import java.util.List;

import com.shristi.training.exception.BookNotFoundException;
import com.shristi.training.exception.IdNotFoundException;

public class BookServiceImpl {
	
	private IBookDetails bookDetails;

	public void setBookdetails(IBookDetails bookdetails) {
		this.bookDetails = bookdetails;
	} 
	
	public List<Book> getBooksByAuthor(String author){
		List<Book> booklist = bookDetails.findByAuthor(author);
		if(booklist.isEmpty())
			throw new BookNotFoundException("Author not found");
		return booklist.stream().sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle())).toList();
	}
	public Book orderBook(int bookId) {
		Book book =bookDetails.findById(bookId);
		if(book==null)
			throw new IdNotFoundException("Book ID not found");
		return book;
	}
	public String addBook(Book book) {
		bookDetails.addBook(book);
		System.out.println("book added");
		return null;
	}
	public String printMessage(String username)
	{
		String result = bookDetails.greetUser(username);
		if(result ==null)
			return null;
		return result.toUpperCase();
	}
}
