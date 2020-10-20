package pizzaAbstractFactory;

public class MainTest {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChciagoPizzaStore();
			
		String[] types = {"cheese","clam"};
		Pizza pizza = null;
		for(String type:types ) {
			pizza = nyStore.orderPizza(type);
			pizza = chicagoStore.orderPizza(type);
		}

	}

}
