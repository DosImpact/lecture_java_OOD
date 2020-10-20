package factory.simplePizzaFactory.Pizzas;

import java.util.ArrayList;

import factory.simplePizzaFactory.Pizza;

public class ATypePizza extends Pizza {
	public ATypePizza() {
		super();
		setName("AType");
		setDough("ADough");
		setCheese("ACheese");
		ArrayList<String> toppings= new ArrayList<String>();
		toppings.add("A-*");
		toppings.add("A-&");
		setToppings(toppings);
	}
}
