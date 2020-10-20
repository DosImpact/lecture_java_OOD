package SOLID.book01;

public class MainTest {
	public static void main(String[] args) { // 생성자와 다른 static 함수이다.
		System.out.println("main test");
		BookManager bookManager = new BookManager();
		bookManager.setBookDataLoader(new BookDataLoader());
		bookManager.setBookDataViewer(new BookDataViewer());
		bookManager.load();
		bookManager.show();
	}
}
