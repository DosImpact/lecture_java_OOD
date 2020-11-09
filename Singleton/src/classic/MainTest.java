package classic;

public class MainTest {
	public static void main(String[] args) {
		// 5개의 스레드를 생성해서, 싱글톤을 테스트 합니다.
		Thread[] ths = new Thread[5];
		for(int i = 0 ; i <5 ;i++) {
			// runnable인터페이스를 구현하는 방법으로 스레드를 생성합니다.
			ths[i] = new Thread(
			new Runnable() {
				@Override
				public void run() {
					// 싱글톤을 생성합니다.
					Singleton instance = Singleton.getInstance(); 
					// 생성된 싱글톤 객체가 같은지 다른지 판단합니다.
					instance.print();
					System.out.println(Integer.toHexString(System.identityHashCode(instance)));
				}
			}
			);
			
			
			ths[i].start();
		}
	}

}
