
public class Singleton {
	// private �̱��� ���� �� ������
	private static Singleton instance;
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// static getInstance - null üũ
	public static Singleton getInstance() {
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
