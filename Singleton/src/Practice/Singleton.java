package Practice;

public class Singleton {
	private static Singleton instance;
	
	public Singleton () {
		System.out.println("constructor Singleton ");
	};
	public static Singleton getInstance() {
		if(instance == null) {
			System.out.println("created Singleton ");
			 instance = new Singleton();
		}
		return instance;
	}

	public void print() {
		System.out.println("hashCode : " + instance.hashCode());
	}
	
}
