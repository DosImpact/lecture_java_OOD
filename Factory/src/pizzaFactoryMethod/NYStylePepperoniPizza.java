package pizzaFactoryMethod;


public class NYStylePepperoniPizza extends Pizza {
	public NYStylePepperoniPizza() {
		name = "NYStyle PepperonPizza";
		dough = "NYStyle Pepperondough";
		sauce = "NYStyle Pepperonsauce";
		toppings.add("NYStyle Fresh Pepperon1");
		toppings.add("NYStyle Fresh Pepperon2");
	}
	@Override
	public void cut() {
		System.out.println("Cutting pizza NY Style");
	}
}
