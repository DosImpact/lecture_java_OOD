
public class MainTest {
	public static void main(String[] args) {
		// 5개의 스레드를 생성해서, 싱글톤을 테스트 합니다.
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
