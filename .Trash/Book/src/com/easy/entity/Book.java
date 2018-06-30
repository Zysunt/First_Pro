package com.easy.entity;

public class Book {
	private int bookno;
	private String bookname;
	private String author;
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public Book(int bookno, String bookname, String author) {
		super();
		this.bookno = bookno;
		this.bookname = bookname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookno=" + bookno + ", bookname=" + bookname + ", author=" + author + "]";
	}
	public Book() {
	}
	
}
