package factory.simplePizzaFactory;

import factory.simplePizzaFactory.Pizzas.ATypePizza;
import factory.simplePizzaFactory.Pizzas.BTypePizza;

public class PizzaFactory {
	public Pizza create(String type) {
		if(type == "ATypePizza") {
			return new ATypePizza();
		}
		else if(type == "BTypePizza") {
			return new BTypePizza();
		}else {
			return null;
		}
	}
}
