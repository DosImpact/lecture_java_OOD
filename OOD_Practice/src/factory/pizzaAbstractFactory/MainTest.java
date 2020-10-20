package factory.pizzaAbstractFactory;

import factory.pizzaAbstractFactory.Store.NYPizzaStore;

public class MainTest {

	public static void main(String[] args) {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		System.out.println(nyPizzaStore.order("PizzaMozza"));
	}

}
