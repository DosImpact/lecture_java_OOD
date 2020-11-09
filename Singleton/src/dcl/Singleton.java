package dcl;

//4. lazy initialization with double checked locking
public class Singleton {
	// private 싱글톤 변수 및 생성자
	private static volatile Singleton instance; // volatile 메인 메모리에 저장을해서 읽기 쓰기가 이루어진다. CPU 캐쉬에 올라가지 않는다.
	private Singleton() {
		System.out.println("Singleton is created");
	}
	// synchronized 키워드로  getInstance - null 체크부분을 스레드간 동기화를 진행 
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
	// instance hashcode 출력
	public void print() {
		System.out.println("HASH CODE : "+instance.hashCode());
	}
}
