package pizzaFactoryMethod;


public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NYStyle CheesePizza";
		dough = "NYStyle Cheesedough";
		sauce = "NYStyle Cheesesauce";
		toppings.add("NYStyle Fresh Cheese1");
		toppings.add("NYStyle Fresh Cheese2");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting pizza NY Style");
	}
}
