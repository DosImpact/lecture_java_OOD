package SOLID.book;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Book main TEST");
		
		BookMananger bookMananger = new BookMananger(null);
		bookMananger.setViewer(new BookDataViewer());
		bookMananger.setLoader(new BookDataLoader());
		
		bookMananger.load();
		bookMananger.show();
	}

}
