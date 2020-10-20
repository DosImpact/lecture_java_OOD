package SOLID.book01;

public class Book {
	double price;
	String isbn;
	String name;
	int year;
	public Book(double price, String isbn, String name, int year) {
		super();
		this.price = price;
		this.isbn = isbn;
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", isbn=" + isbn + ", name=" + name + ", year=" + year + "]";
	}
	
}
