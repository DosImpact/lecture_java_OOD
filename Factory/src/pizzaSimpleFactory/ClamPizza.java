package pizzaSimpleFactory;

public class ClamPizza extends Pizza{
	public ClamPizza() {
		name = "ClamPizza";
		dough = "Clamdough";
		sauce = "Clamsauce";
		toppings.add("Fresh Clam1");
		toppings.add("Fresh Clam2");
	}
}
