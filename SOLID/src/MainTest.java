import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Book b1 = new Book("doyung",2000,10000,"1234");
//		Book b2 = new Book("dosdos",2010,17000,"1412412");
//		System.out.println(b1);
//		System.out.println(b2);
//		b1.load();
//		b1.show();
		
		
//		List<Book> books  =new ArrayList<>();
//		books.add(b1);
//		books.add(b2);
//		BookManager manager = new BookManager(books);
//		manager.load();
//		manager.show();
		
		BookManager manager = new BookManager();
		manager.setLoader(new BookDataLoader());
		manager.setViewer(new BookDataViewer());
		manager.load();
		manager.show();
		
	}

}
