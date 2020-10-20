package factory.pizzaFactoryMethod;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main  Test");
		
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		System.out.println(nyPizzaStore.order("NYPizza01"));
		System.out.println(nyPizzaStore.order("NYPizza02"));
		
		
		ChicagoPizzaStore ChicagoPizzaStore = new ChicagoPizzaStore();
		System.out.println(ChicagoPizzaStore.order("ChicagoPizza01"));
		System.out.println(ChicagoPizzaStore.order("ChicagoPizza02"));
	}

}
