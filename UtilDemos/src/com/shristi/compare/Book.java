package com.shristi.compare;

public class Book {
	private String title;
	private String author;
	private double amount;
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", amount=" + amount + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Book(String title, String author, double amount) {
		super();
		this.title = title;
		this.author = author;
		this.amount = amount;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
