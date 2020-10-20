package factory.pizzaAbstractFactory.Pizza;


import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;
	Veggies[] veggies;
	Clams clams;
	ArrayList<String> toppings = new ArrayList<String>();
	public Pizza() {
		
	}
	public Pizza(String name) {
		this.name = name;
	}
	
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
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDough(Dough dough) {
		this.dough = dough;
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}
	public void setClams(Clams clams) {
		this.clams = clams;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" +  ", toppings=" + toppings + "]";
	}
}
