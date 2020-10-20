package Stretegy.duck;

public class SilentQuack implements QuackBehavior {
	@Override
	public void Quack() {
		System.out.println("SilentQuack");
	}
}
