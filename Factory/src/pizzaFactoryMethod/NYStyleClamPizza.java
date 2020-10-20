package pizzaFactoryMethod;


public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		name = "NYStyle ClamPizza";
		dough = "NYStyle Clamdough";
		sauce = "NYStyle Clamsauce";
		toppings.add("NYStyle Fresh Clam1");
		toppings.add("NYStyle Fresh Clam2");
	}
	@Override
	public void cut() {
		System.out.println("Cutting pizza NY Style");
	}
}
