package classic;

//1.classic - instance변수의 null체크를 한 후 객체를 할당합니다.
// 멀티스레드 환경에서 싱글톤을 유지할 수 없습니다.
public class Singleton {
	// private 싱글톤 변수 및 생성자
	private static Singleton instance;
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// static getInstance - null 체크
	public static Singleton getInstance() {
	// 인스턴스가 없는경우, 싱글톤을 할당
		if(instance == null) {
			instance = new Singleton();
		}
	// 싱글톤변수 리턴
		return Singleton.instance;
	}
	
	// instance hashcode 출력
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
