package SOLID.book01;

import java.util.ArrayList;
import java.util.List;

public class BookDataLoader {
	public List<Book> load(){
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1000,"1234","aaa",10));
		books.add(new Book(2000,"1235","bbb",20));
		return books;
		
	}
	
}

// List는 인터페이스
// List는 add 사용가능
// List인터페이스를 상속한 클래스는 다음이 있다. ArrayList, LinkedList ..
