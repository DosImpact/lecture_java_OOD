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

// List�� �������̽�
// List�� add ��밡��
// List�������̽��� ����� Ŭ������ ������ �ִ�. ArrayList, LinkedList ..
