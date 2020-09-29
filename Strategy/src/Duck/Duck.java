package Duck;

public class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void display() {
		System.out.println("Duck");
	}
	public void swim() {
		System.out.println("swim");
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack() {
		if(quackBehavior != null) {
			quackBehavior.quack();
		}else {
			System.out.println("Error: cannot performQuack");
		}
	}
	public void performFly() {
		if(flyBehavior != null) {
			flyBehavior.fly();
		}else {
			System.out.println("Error: cannot performFly");
		}
	}

}
