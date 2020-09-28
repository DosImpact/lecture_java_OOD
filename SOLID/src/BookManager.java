import java.util.List;

public class BookManager {
	private List<Book> books = null;
	private BookDataLoader loader = null;
	private BookDataViewer viewer = null;

	
	public BookManager() {
		this(null);
	}
	
	public BookManager(List<Book> books) {
		super();
		this.books = books;
	}
	
	public void setLoader(BookDataLoader loader) {
		this.loader = loader;
	}
	public void setViewer(BookDataViewer viewer) {
		this.viewer = viewer; 
	}
	
	public void load() {
		books = this.loader.load();
	}
	
	public void show() {
		this.viewer.show(this.books);
	}
//	public void load() {
//		System.out.println("read book from file");
//	}
//	public void show() {
//		for(Book book:books) {
//			System.out.println("book info"+book);
//		}
//	}


}
