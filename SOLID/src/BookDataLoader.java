import java.util.ArrayList;
import java.util.List;

public class BookDataLoader {
	public List<Book> load() {
		
		Book b1 = new Book("doyung",2000,10000,"1234");
		Book b2 = new Book("dosdos",2010,17000,"1412412");
		
		List<Book> books  = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		return books;
	}
}
