package factory.pizzaFactoryMethod;

public abstract class PizzaStore {
	public abstract Pizza create(String type);
	public Pizza order(String type) {
		Pizza pizza = create(type);
		pizza.prepare();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
}
