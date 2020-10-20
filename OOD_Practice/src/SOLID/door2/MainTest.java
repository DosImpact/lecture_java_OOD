package SOLID.door2;

public class MainTest {
	public static void main(String[] args) {
		Door[] doors = {new PushDoor() ,new SlideDoor()};
		for(Door door:doors ) {
			door.Open();
		}
	}
}
