package SOLID.book01;

import java.util.List;

public class BookManager {
	List<Book> books;
	BookDataLoader bookDataLoader;
	BookDataViewer bookDataViewer;
	
	public void setBookDataLoader(BookDataLoader bookDataLoader) {
		this.bookDataLoader = bookDataLoader;
	}
	public void setBookDataViewer(BookDataViewer bookDataViewer) {
		this.bookDataViewer = bookDataViewer;
	}
	public void load() {
		this.books = bookDataLoader.load();
	}
	public void show() {
		bookDataViewer.show(this.books);;
	}
}
