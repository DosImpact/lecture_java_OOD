package classic;

//1.classic - instance������ nullüũ�� �� �� ��ü�� �Ҵ��մϴ�.
public class Singleton {
	// private �̱��� ���� �� ������
	private static Singleton instance;
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// static getInstance - null üũ
	public static Singleton getInstance() {
	// �ν��Ͻ��� ���°��, �̱����� �Ҵ�
		if(instance == null) {
			instance = new Singleton();
		}
	// �̱��溯�� ����
		return Singleton.instance;
	}
	
	// instance hashcode ���
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
