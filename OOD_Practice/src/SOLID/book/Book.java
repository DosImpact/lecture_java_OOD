package SOLID.book;

public class Book {
	private String author;
	private int publishedYear;
	private double price;
	private String isbn;
	
	public Book(String author, int publishedYear, double price, String isbn) {
		super();
		this.author = author;
		this.publishedYear = publishedYear;
		this.price = price;
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Book [author=" + author + ", publishedYear=" + publishedYear + ", price=" + price + ", isbn=" + isbn
				+ "]";
	}
}

// FB . private 변수명시해주시 . UML 에서 빨간색은 private 이다.