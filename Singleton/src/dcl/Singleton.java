package dcl;

//4. lazy initialization with double checked locking
public class Singleton {
	// private �̱��� ���� �� ������
	private static volatile Singleton instance; // volatile ���� �޸𸮿� �������ؼ� �б� ���Ⱑ �̷������. CPU ĳ���� �ö��� �ʴ´�.
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// synchronized Ű�����  getInstance - null üũ�κ��� �����尣 ����ȭ�� ���� 
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		
		}
		return Singleton.instance;
	}
	// instance hashcode ���
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
