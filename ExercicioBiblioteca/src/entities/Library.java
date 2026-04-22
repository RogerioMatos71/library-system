package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.BorrowResult;

public class Library {

	private int nextIdLoan = 1;
	private int nextUserId = 1;
	private int nextBookId = 1;

	private List<Book> books = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	private List<Loan> loans = new ArrayList<>();

	public User addUser(String name, String cpf) {
		User user = new User(name, cpf, nextUserId++);
		users.add(user);
		return user;
	}


	public int getNextIdLoan() {
		return nextIdLoan;
	}

	public int getNextUserId() {
		return nextUserId;
	}

	public int getNextBookId() {
		return nextBookId;
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<User> getUsers() {
		return users;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void addBook(Book book) {
		book.setId(nextBookId++);
		books.add(book);
	}

	public boolean removeBookById(int id) {
		return books.removeIf(book -> book.getId() == id);

	}

	public Loan borrowBook(Book book, User user) {
		if (book == null || user == null) {
			return null;
		}
		if (!book.isAvailable()) {
			return null;
		}

		LocalDate loanDate = LocalDate.now();
		LocalDate dueDate = loanDate.plusDays(7);

		Loan loan = new Loan(nextIdLoan++, book, user, loanDate, dueDate);

		loans.add(loan);

		book.setAvailable(false);

		return loan;
	}

	public BorrowResult returnBook(Book book, User user) {
		if (book == null || user == null) {
			return BorrowResult.NOT_FOUND;	
		}
		
		for (Loan loan : loans) {
			if (loan.getBook().getId() == book.getId() && loan.getUser().getId() == user.getId()) {
				book.setAvailable(true);
				loans.remove(loan);
				return BorrowResult.SUCCESS;
			}
		} return BorrowResult.NOT_FOUND;
		
		
	}

	public boolean removeUserByCpf(String cpf) {
		return users.removeIf(u -> cpf.equals(u.getCpf()));

	}

	public Book findBookById(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;

			}

		}
		return null;
	}

	public User findUserByCpf(String cpf) {
		if (cpf == null || cpf.isBlank()) {
			return null;
		}
		for (User u : users) {
			if (cpf.equals(u.getCpf())) {
				return u;
			}

		}
		return null;

	}
}
