package SOLID.door;

public class KnobDoor extends Door{

	private void KnobDoorOpen() {
		System.out.println("KnobDoorOpen");
	}
	@Override
	public void Open() {
		KnobDoorOpen();
	}

}
