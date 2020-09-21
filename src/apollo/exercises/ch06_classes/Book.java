package apollo.exercises.ch06_classes;

public class Book {
	private String title;
	private User author;
	private int numPages, isbn;

	public Book(String title, User author, int numPages, int isbn) {
		this.title = title;
		this.author = author;
		this.numPages = numPages;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String toString() {
		return "The details of the book are: " + title + ", " + 
	author.getName() + ", " + numPages + ", " + isbn + ".";
	}
}
