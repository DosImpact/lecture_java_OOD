package Stretegy.duck;

public class MainTest {
	public static void main(String[]args) {
		Duck[] ducks = {new  DecoyDuck()};
		for(Duck duck :ducks ) {
			duck.fly();
			duck.setFlyBehavior(new HighFlyWay());
			duck.fly();
			duck.quack();
		}
	}
}
