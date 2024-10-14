package com.mockito.testcases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.shristi.training.Book;
import com.shristi.training.BookServiceImpl;
import com.shristi.training.IBookDetails;
import com.shristi.training.exception.BookNotFoundException;
import com.shristi.training.exception.IdNotFoundException;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

	@Mock
	private IBookDetails bookDetails;
	@InjectMocks
	BookServiceImpl bookService;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

	Book book1,book2,book3,book4,book5;
	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book(1,"Java","Kathy",900);
		book2 = new Book(2,"CSS","Kathy",200);
		book3 = new Book(3,"Seven Habits","Steve",300);
		book4 = new Book(4,"5 am club","Robin",800);
		book5 = new Book(5,"Spring","Kathy",1000);
	}


	@Test
	void getByAuthor() {
		String author ="Kathy";
		when(bookDetails.findByAuthor(author)).thenReturn(List.of(book1,book2,book5));
		List<Book> actualbooks =bookService.getBooksByAuthor(author);
		List<Book> expectedbooks = List.of(book2,book1,book5);
		assertEquals(expectedbooks,actualbooks);

	}
	
	@Test
	void getByAuthorEmpty() {
		String author ="Steve";
		//
		when(bookDetails.findByAuthor(author)).thenReturn(new ArrayList<Book>());
		//the testcase should throw an exception
		assertThrows(BookNotFoundException.class,()-> bookService.getBooksByAuthor(author));

	}
	
	@Test
	@Disabled
	void getByAuthorNeg() {
		String author ="Steve";
		//
		when(bookDetails.findByAuthor(author)).thenThrow(BookNotFoundException.class);
		assertThrows(BookNotFoundException.class,()-> bookService.getBooksByAuthor(author));

	}

	@Test
	void testPrintMessage() {
		String username = "Remya";
		when(bookDetails.greetUser(username)).thenReturn("GREAT DAY " + username);
		String actual = bookService.printMessage(username);
		assertEquals("GREAT DAY " + username.toUpperCase(), actual);
	}

	@Test
	void testPrintMessageAsNull() {
		String username = "Jose";
		when(bookDetails.greetUser(username)).thenReturn(null);
		String actual = bookService.printMessage(username);
		assertNull(actual);
	}

	@Test
	void testPrintWrongMessage() {
		String username = "Remya";
		when(bookDetails.greetUser(username)).thenReturn("Wrong username");
		String actual = bookService.printMessage(username).toUpperCase();
		assertEquals("WRONG USERNAME", actual);
	}
	
	@Test
	void testfindById()
	{
		int bookId = 1;
		when(bookDetails.findById(bookId)).thenReturn(book1);
		Book actualbook =bookService.orderBook(bookId);
		Book expectedbook = book1;
		assertEquals(expectedbook,actualbook);
	}
	
	@Test
	void testfindByIdEmpty()
	{
		int bookId = 7;
		when(bookDetails.findById(bookId)).thenReturn(null);
		assertThrows(IdNotFoundException.class,()->bookService.orderBook(bookId));
	}
	
	@Test
	void testfindByIdException()
	{
		int bookId = 7;
		when(bookDetails.findById(bookId)).thenThrow(IdNotFoundException.class);
		assertThrows(IdNotFoundException.class,()->bookService.orderBook(bookId));
	}

}
