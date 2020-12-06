
public class Singleton {
	// private 싱글톤 변수 및 생성자
	private static Singleton instance;
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// static getInstance - null 체크
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return Singleton.instance;
	}
	
	// instance hashcode 출력
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
