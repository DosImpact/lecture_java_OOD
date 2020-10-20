package pizzaAbstractFactory;

public class PepperoniPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("prepare "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		
		System.out.println(sauce);
		System.out.println(dough);
		System.out.println(cheese);
	}
	
}
