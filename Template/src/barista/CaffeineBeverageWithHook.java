package barista;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customCondiments()) {
			addCondiments();	
		}
	}
	protected boolean customCondiments() {
		return false;
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
