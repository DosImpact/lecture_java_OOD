
public class MainTest {
	public static void main(String[] args) {
		// 5���� �����带 �����ؼ�, �̱����� �׽�Ʈ �մϴ�.
		Thread[] ths = new Thread[5];
		for(int i = 0 ; i <5 ;i++) {
			ths[i] = new Thread(
				new Runnable() {
				@Override
				public void run() {
					Singleton instance = Singleton.getInstance();
					instance.print();
					System.out.println(Integer.toHexString(System.identityHashCode(instance)));
				}
			} );
			ths[i].start();
		}
	}
}
