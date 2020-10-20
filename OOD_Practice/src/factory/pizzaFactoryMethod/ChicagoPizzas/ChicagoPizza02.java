package factory.pizzaFactoryMethod.ChicagoPizzas;

import java.util.ArrayList;

import factory.pizzaFactoryMethod.Pizza;

public class ChicagoPizza02 extends Pizza {

	public ChicagoPizza02() {
		super();
		setName("ChicagoPizza02 Name");
		setDough("ChicagoPizza02 Dough");
		setCheese("ChicagoPizza02 Cheese");
		ArrayList<String> toppings = new ArrayList<String>();
		toppings.add("ChicagoPizza topping02^$%#^$^");
		toppings.add("ChicagoPizza topping02%$#");
		setToppings(toppings);
	}

	public ChicagoPizza02(String name, String dough, String cheese, ArrayList<String> toppings) {
		super(name, dough, cheese, toppings);
		// TODO Auto-generated constructor stub
	}
	
}
