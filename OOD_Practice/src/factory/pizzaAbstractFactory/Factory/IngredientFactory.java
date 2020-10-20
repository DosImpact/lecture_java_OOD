package factory.pizzaAbstractFactory.Factory;

import factory.pizzaAbstractFactory.Pizza.Cheese;
import factory.pizzaAbstractFactory.Pizza.Clams;
import factory.pizzaAbstractFactory.Pizza.Dough;
import factory.pizzaAbstractFactory.Pizza.Veggies;

public interface IngredientFactory {
	Cheese createCheese ();
	Clams  createClams();
	Dough createDough();
	Veggies createVeggies();
}
