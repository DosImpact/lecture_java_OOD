package Practice;

public class MainTest {

	public static void main(String[] args) {
		// 5���� �����带 ���� �̱��� getinstace������ �ĺ� �ϱ�
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
