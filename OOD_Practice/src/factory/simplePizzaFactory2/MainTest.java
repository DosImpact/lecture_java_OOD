package factory.simplePizzaFactory2;

public class MainTest {

	public static void main(String[] args) {
//		System.out.println("Main Test Pizza");
		PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
		System.out.println(pizzaStore.order("tomato"));
		System.out.println(pizzaStore.order("cheese"));
	}

}
