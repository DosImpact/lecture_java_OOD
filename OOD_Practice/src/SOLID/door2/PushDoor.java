package SOLID.door2;

public class PushDoor extends Door {
	
	void PushDoorOpen() {
		System.out.println("PushDoorOpen");
	}
	@Override
	public void Open() {
		PushDoorOpen();
	}
	
}
