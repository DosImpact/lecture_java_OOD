
public class KnobDoor extends Door{

	
	public void pressOpen() {
		System.out.println("KnobDoor door open");
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		pressOpen();
	}	
}
