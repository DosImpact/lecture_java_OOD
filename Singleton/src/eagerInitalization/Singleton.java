package eagerInitalization;

// 3. earger initialization 싱글톤 클래스의 static맴버로 클래스 초기화때 객체를 할당한다.
public class Singleton {
	// private 싱글톤 변수 및 생성자
	private static Singleton instance = new Singleton(); // 초기화와 동시에 객체할당
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// static getInstance - null 체크
	public static Singleton getInstance() {
		return Singleton.instance;
	}
	
	// instance hashcode 출력
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
