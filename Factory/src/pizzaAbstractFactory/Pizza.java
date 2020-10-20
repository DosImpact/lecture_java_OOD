package pizzaAbstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Veggies[] veggies;
	Pepperoni pepperoni;
	Clams clams;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	public abstract void prepare();
	public void bake() {
		System.out.println("pizza Ab bake "+name);
	}
	public void cut() { 
		System.out.println("pizza Ab cut "+name);
	}
	public void box() {
		System.out.println("pizza Ab box "+name);
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
	}
}
