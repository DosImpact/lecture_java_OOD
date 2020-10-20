package startbuzzCoffee;

public class starbuzzCoffeeMainTest {

	public static void main(String[] args) {
		Beverage b = new Espresso();
		System.out.println(b.getDescription() + " $ " + b.cost());
		
		b = new DarkRoast();
		b = new Mocha(b);
		b = new Mocha(b);
		b = new Whip(b);
		System.out.println(b.getDescription() + " $ " + b.cost());
	}

}
