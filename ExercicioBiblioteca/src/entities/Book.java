package entities;

public class Book {
	
	

	private String title;
	private String isbn;
	private int id;
	private boolean available;
	private boolean unavailable;
	

	
	
	public boolean isUnavailable() {
		return unavailable;
	}

	public void setUnavailable(boolean unavailable) {
		this.unavailable = unavailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Book() {
		
	}

	public Book(String title, String isbn, int id) {
		this.title = title;
		this.isbn = isbn;
		this.id = id;
		this.available = true;
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
	
	
	
	public boolean isAvailable() {
		return available;
	
	}
	
	public boolean isUnvailable() {
		return unavailable;
	
	}
	

}
