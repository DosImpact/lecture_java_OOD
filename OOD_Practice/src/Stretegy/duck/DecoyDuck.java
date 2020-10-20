package Stretegy.duck;

public class DecoyDuck extends Duck {

	DecoyDuck(){
		this.flyBehavior = new NoFlyWay();
		this.quackBehavior = new BigQuack();
	}
	@Override
	public void fly() {
		this.flyBehavior.fly();
	}

	@Override
	public void quack() {
		this.quackBehavior.Quack();
	}

}
