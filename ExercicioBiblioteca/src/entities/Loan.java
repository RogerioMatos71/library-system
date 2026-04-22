package entities;

import java.time.LocalDate;

public class Loan {

	private int idLoan;
	private Book book;
	private User user;
	private LocalDate loanDate;
	private LocalDate dueDate;

	public Loan(int id, Book book, User user, LocalDate loanDate, LocalDate dueDate) {
		super();
        this.idLoan = id;
		this.book = book;
		this.user = user;
		this.loanDate = loanDate;
		this.dueDate = dueDate;
	}

	public void setIdLoan(int idLoan) {
		this.idLoan = idLoan;
	}

	public int getIdLoan() {
		return idLoan;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
