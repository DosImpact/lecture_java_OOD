package SOLID.book;

import java.util.List;
import java.util.ArrayList;

public class BookDataLoader {
	
	// å�� �ε��ؼ� ��ȯ���ֱ�
	public List<Book> load() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("111",1000,123.1,"1234"));
		books.add(new Book("222",2000,223.1,"1235"));		
		return books;
	}
}
