package factory.simplePizzaFactory;

public class MainTest {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
		System.out.println(pizzaStore.order("ATypePizza"));
		System.out.println(pizzaStore.order("BTypePizza"));
	}

}
