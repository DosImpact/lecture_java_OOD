package factory.simplePizzaFactory;

import java.util.ArrayList;

public class Pizza {
	String name;
	String dough;
	String cheese;
	ArrayList<String> toppings;
	
	public Pizza() {
	}
	public Pizza(String name, String dough, String cheese, ArrayList<String> toppings) {
		super();
		this.name = name;
		this.dough = dough;
		this.cheese = cheese;
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", cheese=" + cheese + ", toppings=" + toppings + "]";
	}
}
