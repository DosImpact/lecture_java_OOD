package Practice;

public class MainTest {

	public static void main(String[] args) {
		// 5개의 스래드를 만들어서 싱글톤 getinstace가져와 식별 하기
		Thread[] ths = new Thread[5];
		for(int i = 0; i < ths.length ; i++) {
			ths[i] = new Thread(
					new Runnable() {
						@Override
						public void run() {
							Singleton s = Singleton.getInstance();
							s.print();
							System.out.println("toHexString : " +Integer.toHexString(System.identityHashCode(s)));
						}
					});
			ths[i].start();
		}
	}

}
