package pizzaFactoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	public void prepare() {
		System.out.println("pizzaOffical prepare "+name);
		for(String topping: toppings) {
			System.out.println("add topping"+topping);
		}
	}
	public void bake() {
		System.out.println("pizzaOffical bake "+name);
	}
	public void cut() { 
		System.out.println("pizzaOffical cut "+name);
	}
	public void box() {
		System.out.println("pizzaOffical box "+name);
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
	}
}
