package innerstatic;

//5. inner static class 
public class Singleton {
	// private 싱글톤 변수 및 생성자
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// 싱글톤 홀더라는 내부 static클래스를 두어서, 싱글톤 객체를 초기화시 할당해준다.
	private static class SingletonHolder {
		static final Singleton inst = new Singleton();
	}
	// inner static의 싱글톤 변수를 리턴하여, 멀티스레드 환경의 싱글톤을 대응한다.
	public static Singleton getInstance() {
		return SingletonHolder.inst;
	}
	// instance hashcode 출력
	public void print() {
		System.out.println("HASH CODE : " + getInstance().hashCode());
	}
}
