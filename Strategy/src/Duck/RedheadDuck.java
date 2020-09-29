package Duck;


public class RedheadDuck  extends Duck{

	public RedheadDuck() {
		super();
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	
	@Override
	public void display() {
		System.out.println("RedheadDuck");
	}
	
	
}
