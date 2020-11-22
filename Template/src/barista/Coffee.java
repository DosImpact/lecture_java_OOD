package barista;

public class Coffee  extends CaffeineBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("Dripping Coffee");
	}

	@Override
	protected void brew() {
		System.out.println("Adding Suger and Cream ");
	}

}
