package factory.pizzaAbstractFactory.Pizza;

import factory.pizzaAbstractFactory.Factory.IngredientFactory;

public class PizzaMozza extends Pizza {
	
	IngredientFactory ingredientFactory;

	public PizzaMozza(IngredientFactory ingredientFactory) {
		super("PizzaMozza");
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		setCheese(ingredientFactory.createCheese());
		setClams(ingredientFactory.createClams());
		setDough(ingredientFactory.createDough());
	}

}
