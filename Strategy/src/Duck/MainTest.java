package Duck;

public class MainTest {

	public static void main(String[] args) {
		Duck duck1 = new MallerDuck();
		duck1.display();
		duck1.performQuack();
		duck1.performFly();
		
		Duck duck2 = new RubberDuck();
		duck2.display();
		duck2.performFly();
		duck2.performQuack();
		duck2.setFlyBehavior(new RocketPoweredFly());
		duck2.performFly();
		
		Duck duck3 = new DecoyDuck();
		duck3.display();
		duck3.performFly();
		duck3.performQuack();
		
		Duck duck4 = new RedheadDuck();
		duck4.display();
		duck4.performFly();
		duck4.performQuack();
	}

}
