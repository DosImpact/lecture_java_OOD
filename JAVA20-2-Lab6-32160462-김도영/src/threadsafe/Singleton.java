package threadsafe;

//2.. thread-safe using synchronized keyword
public class Singleton {
	// private 싱글톤 변수 및 생성자
	private static Singleton instance;
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// synchronized 키워드를 추가해서  멀티스레드의 접근을 제한하여,싱글톤패턴을 유지합니다.
	public static synchronized Singleton getInstance() {
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
