package Duck;


public class MallerDuck  extends Duck{

	public MallerDuck() {
		super();
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	
	@Override
	public void display() {
		System.out.println("MarllerDukc");
	}
	
	
}
