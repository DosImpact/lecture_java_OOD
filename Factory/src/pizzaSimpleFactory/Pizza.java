package pizzaSimpleFactory;

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
		System.out.println("prepare "+name);
	}
	public void bake() {
		System.out.println("bake "+name);
	}
	public void cut() { 
		System.out.println("cut "+name);
	}
	public void box() {
		System.out.println("box "+name);
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", toppings=" + toppings + "]";
	}
}
