package barista;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	protected abstract void addCondiments();
	protected abstract void brew();
	private void boilWater() {
		System.out.println("boilWater...");
	}
	private void pourInCup() {
		System.out.println("pourInCup...");
	}
}
