package Stretegy.duck;

public class NoFlyWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("cannot fly");
	}
}
