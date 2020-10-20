package factory.pizzaFactoryMethod;

import java.util.ArrayList;

public class Pizza {
	String name;
	String dough;
	String cheese;
	ArrayList<String> toppings;
	
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(String name, String dough, String cheese, ArrayList<String> toppings) {
		super();
		this.name = name;
		this.dough = dough;
		this.cheese = cheese;
		this.toppings = toppings;
	}
	public void cut() {
		System.out.println(name+" cutting");
	}
	public void prepare() {
		System.out.println(name+" prepare :"+this);
	}
	public void box() {
		System.out.println(name+" box");
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
	};
	
	
}
