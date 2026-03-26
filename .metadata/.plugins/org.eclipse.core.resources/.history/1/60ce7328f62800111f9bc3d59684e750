package entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private String isbn;
	private Boolean available;
	
	private List<Book> books = new ArrayList<>();
	
	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Book() {
		
	}

	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	public String isAvailable() {
		for (Book b : books) {
			if (b.getTitle().equals(title)) {
				return "Book is available";
			}
		}
		  return "Book is not available";
		
	}
	
	

}
