package SOLID.door2;

public class SlideDoor extends Door {
	
	void slideOpen() {
		System.out.println("slideOpen");
	}
	@Override
	public void Open() {
		slideOpen();
	}
	
}
