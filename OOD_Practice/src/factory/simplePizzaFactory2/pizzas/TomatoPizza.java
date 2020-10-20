package factory.simplePizzaFactory2.pizzas;

import java.util.ArrayList;
import java.util.Arrays;

import factory.simplePizzaFactory2.Pizza;

public class TomatoPizza extends Pizza {

	public TomatoPizza() {
		super();
		setCheeze("TomatoPizza Cheeze");
		setDough("TomatoPizza Dough");
		setName("TomatoPizza");
	}

	public TomatoPizza(String name, String dough, String cheeze, ArrayList<String> toppings) {
		super(name, dough, cheeze, toppings);
	}
	
}
