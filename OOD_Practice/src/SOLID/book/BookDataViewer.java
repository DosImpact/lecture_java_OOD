package SOLID.book;

import java.util.List;

public class BookDataViewer {
	public void show(List<Book> books) {
		for(Book book : books) {
			System.out.println("book"+book);
		}
	}
}
