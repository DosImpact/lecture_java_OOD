package factory.simplePizzaFactory2;

import factory.simplePizzaFactory2.pizzas.CheezePizza;
import factory.simplePizzaFactory2.pizzas.TomatoPizza;

public class PizzaFactory {
	
	public Pizza create(String type) {
		if(type == "tomato") {
			return new TomatoPizza();
		}else if(type =="cheese") {
			return new CheezePizza();
		}
		else {
			return null;
		}
	}

}
