package Duck;


public class RubberDuck  extends Duck{

	public RubberDuck() {
		super();
		setQuackBehavior(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("RubberDuck");
	}
	
	
}
