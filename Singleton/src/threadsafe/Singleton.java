package threadsafe;

//2.. thread-safe using synchronized keyword
public class Singleton {
	// private �̱��� ���� �� ������
	private static Singleton instance;
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// synchronized Ű���带 �߰��ؼ�  ��Ƽ�������� ������ �����Ͽ�,�̱��������� �����մϴ�.
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return Singleton.instance;
	}
	// instance hashcode ���
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
