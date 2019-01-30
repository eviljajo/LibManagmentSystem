package com.librarymanagment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private long book_id;
	private String author;
	private String name;
	private String status;
	private String language;
	private int quantity;
	private java.sql.Date yearOfPublish;
	
	public long getBook_id() {
		return book_id;
	}
	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public java.sql.Date getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(java.sql.Date yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	
	
	
	
	
	
	

}
