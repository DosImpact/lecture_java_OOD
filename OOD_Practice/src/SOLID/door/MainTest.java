package SOLID.door;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("door main test");
		
//		Door door = new KnobDoor();
//		if(door instanceof AutomaticDoor) {
//			((AutomaticDoor)door).Open();
//		}
//		if(door instanceof KnobDoor) {
//			((KnobDoor)door).Open();
//		}
//		if(door instanceof SlidingDoor) {
//			((SlidingDoor)door).Open();
//		}
		
		Door[] doors = {new AutomaticDoor(),new KnobDoor(),new SlidingDoor()};
		for(Door door:doors) {
			door.Open();
		}
	}

}
