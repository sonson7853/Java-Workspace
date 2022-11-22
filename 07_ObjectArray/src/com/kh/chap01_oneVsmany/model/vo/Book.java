package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	//필드부
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	
	//생성부
	public Book() {
		
	}
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	//메소드부
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;	
	}		
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	
	// 2.getter 메소드
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	
	// 3.information 메소드
	public String information() {
		return title + "," + author + "," + price + "," + publisher;
	}
}
