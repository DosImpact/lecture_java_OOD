package factory.pizzaFactoryMethod;

import factory.pizzaFactoryMethod.NYPizzas.NYPizza01;
import factory.pizzaFactoryMethod.NYPizzas.NYPizza02;

public  class NYPizzaStore  extends PizzaStore{

	@Override
	public Pizza create(String type) {
		if(type.equals("NYPizza01")) {
			return new NYPizza01();
		}
		else if(type.equals("NYPizza02")) {
			return new NYPizza02();
		}else {
			return null;
		}
	}


	
}
