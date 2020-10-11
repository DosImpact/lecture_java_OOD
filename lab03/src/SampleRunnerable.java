// 스레드 예제
public class SampleRunnerable implements Runnable {
	
	private int[] tmp;
	public SampleRunnerable() {
		tmp = new int[10];
		for(int i = 0 ; i < tmp.length;i++) {
			tmp[i]=i;
		}
	}

	@Override
	public void run() {
		for(int now:tmp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("Thead"+Thread.currentThread().getName()+"is running"+now);
		}
		
	}

}
