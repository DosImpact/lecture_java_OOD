package factory.pizzaFactoryMethod;

import factory.pizzaFactoryMethod.ChicagoPizzas.ChicagoPizza01;
import factory.pizzaFactoryMethod.ChicagoPizzas.ChicagoPizza02;

public  class ChicagoPizzaStore  extends PizzaStore{

	@Override
	public Pizza create(String type) {
		if(type.equals("ChicagoPizza01")) {
			return new ChicagoPizza01();
		}
		else if(type.equals("ChicagoPizza02")) {
			return new ChicagoPizza02();
		}else {
			return null;
		}
	}


	
}
