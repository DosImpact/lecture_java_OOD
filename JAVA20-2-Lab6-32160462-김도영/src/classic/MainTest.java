package classic;

public class MainTest {
	public static void main(String[] args) {
		// 5���� �����带 �����ؼ�, �̱����� �׽�Ʈ �մϴ�.
		Thread[] ths = new Thread[5];
		for(int i = 0 ; i <5 ;i++) {
			// runnable�������̽��� �����ϴ� ������� �����带 �����մϴ�.
			ths[i] = new Thread(
			new Runnable() {
				@Override
				public void run() {
					// �̱����� �����մϴ�.
					Singleton instance = Singleton.getInstance(); 
					// ������ �̱��� ��ü�� ������ �ٸ��� �Ǵ��մϴ�.
					instance.print();
					System.out.println(Integer.toHexString(System.identityHashCode(instance)));
				}
			}
			);
			
			
			ths[i].start();
		}
	}

}
