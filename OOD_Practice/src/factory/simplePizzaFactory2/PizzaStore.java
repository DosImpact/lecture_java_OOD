package factory.simplePizzaFactory2;

public class PizzaStore {
	PizzaFactory factory;

	public PizzaStore(PizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza order(String type) {
		Pizza pizza = factory.create(type);
		pizza.cut();
		pizza.prepare();
		return pizza;
	}

}
