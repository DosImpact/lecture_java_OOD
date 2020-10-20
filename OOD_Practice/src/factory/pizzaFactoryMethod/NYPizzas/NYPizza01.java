package factory.pizzaFactoryMethod.NYPizzas;

import java.util.ArrayList;

import factory.pizzaFactoryMethod.Pizza;

public class NYPizza01 extends Pizza {

	public NYPizza01() {
		super();
		setName("NYPizza01 Name");
		setDough("NYPizza01 Dough");
		setCheese("NYPizza01 Cheese");
		ArrayList<String> toppings = new ArrayList<String>();
		toppings.add("NYPizza topping01");
		toppings.add("NYPizza topping02");
		setToppings(toppings);
	}

	public NYPizza01(String name, String dough, String cheese, ArrayList<String> toppings) {
		super(name, dough, cheese, toppings);
		// TODO Auto-generated constructor stub
	}
	
}
