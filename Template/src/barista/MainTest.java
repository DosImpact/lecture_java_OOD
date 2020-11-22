package barista;

public class MainTest {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Tea tea = new Tea();
		
		System.out.println("Coffee prepareRecipe...");
		coffee.prepareRecipe();

		System.out.println("Tea prepareRecipe...");
		tea.prepareRecipe();
		
		
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		TeaWithHook teaWithHook = new TeaWithHook();

		System.out.println("Coffee prepareRecipe...");
		coffeeWithHook.prepareRecipe();

		System.out.println("Tea prepareRecipe...");
		teaWithHook.prepareRecipe();
		
		
	}

}
