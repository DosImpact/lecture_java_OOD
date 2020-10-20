package factory.pizzaAbstractFactory.Store;

import factory.pizzaAbstractFactory.Factory.NYIngredientFactory;
import factory.pizzaAbstractFactory.Pizza.Pizza;
import factory.pizzaAbstractFactory.Pizza.PizzaMozza;

public class NYPizzaStore  extends PizzaStore{

	@Override
	public Pizza create(String type) {
		NYIngredientFactory nYIngredientFactory = new NYIngredientFactory();
		
		if( type.equals("PizzaMozza") ) {
			return new PizzaMozza(nYIngredientFactory);
		}
		return null;
	}



}
