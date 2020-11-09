package innerstatic;

//5. inner static class 
public class Singleton {
	// private �̱��� ���� �� ������
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// �̱��� Ȧ����� ���� staticŬ������ �ξ, �̱��� ��ü�� �ʱ�ȭ�� �Ҵ����ش�.
	private static class SingletonHolder {
		static final Singleton inst = new Singleton();
	}
	// inner static�� �̱��� ������ �����Ͽ�, ��Ƽ������ ȯ���� �̱����� �����Ѵ�.
	public static Singleton getInstance() {
		return SingletonHolder.inst;
	}
	// instance hashcode ���
	public void print() {
		System.out.println("HASH CODE : " + getInstance().hashCode());
	}
}
