package factory.pizzaAbstractFactory.Factory;

import factory.pizzaAbstractFactory.Pizza.Cheese;
import factory.pizzaAbstractFactory.Pizza.CheeseMozza;
import factory.pizzaAbstractFactory.Pizza.Clams;
import factory.pizzaAbstractFactory.Pizza.ClamsMozza;
import factory.pizzaAbstractFactory.Pizza.Dough;
import factory.pizzaAbstractFactory.Pizza.DoughMozza;
import factory.pizzaAbstractFactory.Pizza.Veggies;
import factory.pizzaAbstractFactory.Pizza.VeggiesMozza;

public class NYIngredientFactory implements IngredientFactory{

	@Override
	public Cheese createCheese() {
		return new CheeseMozza();
	}

	@Override
	public Clams createClams() {
		return new ClamsMozza();
	}

	@Override
	public Dough createDough() {
		return new DoughMozza();
	}

	@Override
	public Veggies createVeggies() {
		return new VeggiesMozza();
	}

}
