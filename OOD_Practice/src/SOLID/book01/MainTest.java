package SOLID.book01;

public class MainTest {
	public static void main(String[] args) { // �����ڿ� �ٸ� static �Լ��̴�.
		System.out.println("main test");
		BookManager bookManager = new BookManager();
		bookManager.setBookDataLoader(new BookDataLoader());
		bookManager.setBookDataViewer(new BookDataViewer());
		bookManager.load();
		bookManager.show();
	}
}
