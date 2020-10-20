package factory.pizzaFactoryMethod.ChicagoPizzas;

import java.util.ArrayList;

import factory.pizzaFactoryMethod.Pizza;

public class ChicagoPizza01 extends Pizza {

	public ChicagoPizza01() {
		super();
		setName("ChicagoPizza01 Name");
		setDough("ChicagoPizza01 Dough");
		setCheese("ChicagoPizza01 Cheese");
		ArrayList<String> toppings = new ArrayList<String>();
		toppings.add("ChicagoPizza topping01");
		toppings.add("ChicagoPizza topping02");
		setToppings(toppings);
	}

	public ChicagoPizza01(String name, String dough, String cheese, ArrayList<String> toppings) {
		super(name, dough, cheese, toppings);
		// TODO Auto-generated constructor stub
	}
	
}
