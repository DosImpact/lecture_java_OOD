package pizzaAbstractFactory;


public class ChciagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(type.equals("cheese")) {
			return new CheesePizza(ingredientFactory);
		}else if(type.equals("pepperoni")) {
			return  new PepperoniPizza(ingredientFactory);
		}else if(type.equals("clam")) {
			return new ClamPizza(ingredientFactory);
		}else if(type.equals("veggie")) {
			return new VegglePizza(ingredientFactory);
		}
		return null;
	}
	
}
