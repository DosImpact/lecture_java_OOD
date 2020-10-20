package factory.pizzaFactoryMethod.NYPizzas;

import java.util.ArrayList;

import factory.pizzaFactoryMethod.Pizza;

public class NYPizza02 extends Pizza {

	public NYPizza02() {
		super();
		setName("NYPizza02 Name");
		setDough("NYPizza02 Dough");
		setCheese("NYPizza02 Cheese");
		ArrayList<String> toppings = new ArrayList<String>();
		toppings.add("NYPizza topping02^$%#^$^");
		toppings.add("NYPizza topping02%$#");
		setToppings(toppings);
	}

	public NYPizza02(String name, String dough, String cheese, ArrayList<String> toppings) {
		super(name, dough, cheese, toppings);
		// TODO Auto-generated constructor stub
	}
	
}
