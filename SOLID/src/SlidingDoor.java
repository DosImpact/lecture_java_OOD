
public class SlidingDoor extends Door{

	
	public void slideOpen() {
		System.out.println("SlidingDoor door open");
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		slideOpen();
	}	
}
