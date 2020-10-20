package SOLID.book01;

import java.util.List;

public class BookDataViewer {
	public void show(List<Book> books) {
		for(Book book : books) {
			System.out.println("book : "+book);
		}
	}
}
