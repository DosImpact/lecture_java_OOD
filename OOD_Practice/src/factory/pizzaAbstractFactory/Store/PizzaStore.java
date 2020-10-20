package factory.pizzaAbstractFactory.Store;

import factory.pizzaAbstractFactory.Pizza.Pizza;

public abstract class PizzaStore {
	public Pizza order(String type) {
		Pizza pizza = create(type);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		pizza.cut();
		return pizza;
	}
	public abstract Pizza create(String type);
}
