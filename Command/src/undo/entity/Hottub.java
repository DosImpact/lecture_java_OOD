package undo.entity;

public class Hottub {
	boolean on;
	int temperature;
	
	public void on() {
		on = true;
	}
	public void off() {
		on = false;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public void heat() {
		this.temperature = 105;
		System.out.println("Hottub is heat 105 degrees");
	}
	public void cool() {
		this.temperature = 35;
		System.out.println("Hottub is heat 35 degrees");
	}
	
	

}
  