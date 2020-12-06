package eagerInitalization;

// 3. earger initialization �̱��� Ŭ������ static�ɹ��� Ŭ���� �ʱ�ȭ�� ��ü�� �Ҵ��Ѵ�.
public class Singleton {
	// private �̱��� ���� �� ������
	private static Singleton instance = new Singleton(); // �ʱ�ȭ�� ���ÿ� ��ü�Ҵ�
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// static getInstance - null üũ
	public static Singleton getInstance() {
		return Singleton.instance;
	}
	
	// instance hashcode ���
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
