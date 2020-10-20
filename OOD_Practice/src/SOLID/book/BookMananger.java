package SOLID.book;

import java.util.ArrayList;
import java.util.List;

public class BookMananger {
	private List<Book> books;
	private BookDataLoader bookDataLoader;
	private BookDataViewer bookDataViewer;
	public BookMananger() {
	}
	public BookMananger(List<Book> books) {
		this.books= books; 
	}


	public void setLoader(BookDataLoader bookDataLoader) {
		this.bookDataLoader = bookDataLoader;
	}
	public void setViewer(BookDataViewer bookDataViewer) {
		this.bookDataViewer = bookDataViewer;
	}
	public void show() {
		this.bookDataViewer.show(this.books);
	}
	public void load() {
		this.books = this.bookDataLoader.load();
	}
}
