package pizzaFactoryMethod;


public class ChciagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChciagoStyleCheesePizza();
		}else if(type.equals("pepperoni")) {
			return  new ChciagoStylePepperoniPizza();
		}else if(type.equals("clam")) {
			return new ChciagoStyleClamPizza();
			
		}else if(type.equals("veggie")) {
			return new ChciagoStyleVegglePizza();
		}
		return null;
	}
	
}
