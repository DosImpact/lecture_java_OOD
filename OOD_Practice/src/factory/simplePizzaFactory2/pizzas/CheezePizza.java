package factory.simplePizzaFactory2.pizzas;

import java.util.ArrayList;
import java.util.Arrays;

import factory.simplePizzaFactory2.Pizza;

public class CheezePizza extends Pizza {

	public CheezePizza() {
		super();
		setCheeze("CheezePizza Cheeze");
		setDough("CheezePizza Dough");
		setName("CheezePizza");
	}

	public CheezePizza(String name, String dough, String cheeze, ArrayList<String> toppings) {
		super(name, dough, cheeze, toppings);
	}
	
}
