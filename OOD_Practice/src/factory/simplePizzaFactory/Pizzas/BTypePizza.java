package factory.simplePizzaFactory.Pizzas;

import java.util.ArrayList;

import factory.simplePizzaFactory.Pizza;

public class BTypePizza extends Pizza {
	public BTypePizza() {
		super();
		setName("BTypePizza");
		setDough("BTypeDough");
		setCheese("BTypeCheese");
		ArrayList<String> toppings= new ArrayList<String>();
		toppings.add("B-*");
		toppings.add("B-&");
		toppings.add("B-%");
		setToppings(toppings);
	}
}
