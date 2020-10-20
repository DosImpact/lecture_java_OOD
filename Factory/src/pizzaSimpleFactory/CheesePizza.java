package pizzaSimpleFactory;

public class CheesePizza extends Pizza{
	public CheesePizza() {
		name = "CheesePizza";
		dough = "Cheesedough";
		sauce = "Cheesesauce";
		toppings.add("Fresh Cheese1");
		toppings.add("Fresh Cheese2");
	}
}
