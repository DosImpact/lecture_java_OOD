package factory.simplePizzaFactory;

public class PizzaStore {
	PizzaFactory factory;
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	public Pizza order(String type) {
		Pizza pizza = factory.create(type);
		return pizza;
				
	}
}
