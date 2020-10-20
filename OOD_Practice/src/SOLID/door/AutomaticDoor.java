package SOLID.door;

public class AutomaticDoor extends Door{

	private void AutomaticDoorOpen() {
		System.out.println("AutomaticDoorOpen");
	}
	@Override
	public void Open() {
		AutomaticDoorOpen();
	}

}
