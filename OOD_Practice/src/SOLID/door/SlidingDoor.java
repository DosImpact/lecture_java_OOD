package SOLID.door;

public class SlidingDoor extends Door{

	private void SlidingDoorOpen() {
		System.out.println("SlidingDoorOpen");
	}
	@Override
	public void Open() {
		SlidingDoorOpen();
	}

}
