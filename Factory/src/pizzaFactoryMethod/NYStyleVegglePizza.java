package pizzaFactoryMethod;


public class NYStyleVegglePizza extends Pizza {
	public NYStyleVegglePizza() {
		name = "NYStyle VegglePizza";
		dough = "NYStyle Veggledough";
		sauce = "NYStyle Vegglesauce";
		toppings.add("NYStyle Fresh Veggle1");
		toppings.add("NYStyle Fresh Veggle2");
	}
	@Override
	public void cut() {
		System.out.println("Cutting pizza NY Style");
	}
}
