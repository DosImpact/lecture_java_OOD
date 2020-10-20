package factory.simplePizzaFactory2;

import java.util.ArrayList;

public class Pizza {
	String name;
	String dough;
	String Cheeze;
	ArrayList<String> toppings;
	
	public Pizza() {
	}
	public Pizza(String name, String dough, String cheeze, ArrayList<String> toppings) {
		super();
		this.name = name;
		this.dough = dough;
		Cheeze = cheeze;
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
	public String getCheeze() {
		return Cheeze;
	}
	public void setCheeze(String cheeze) {
		Cheeze = cheeze;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", Cheeze=" + Cheeze + ", toppings=" + toppings + "]";
	}
	
	public void cut() {
		System.out.println("cutting Pizza");
	}
	public void prepare() {
		System.out.println("prepare Pizza");
	}
}
