package undo.entity;

public class CeilingFan {
	String location = "";
	int level = 0;
	public static final int HIGH =3;
	public static final int MEDIUM =2;
	public static final int LOW =1;
	public static final int OFF =0;
	
	public CeilingFan(String location) {
		this.location = location;
	}
	public int getLevel() {
		return level;
	}
	public void high() {
		this.level = HIGH;
		System.out.println(location+" celing fan is on "+this.level);
	}
	public void medium() {
		this.level = MEDIUM;
		System.out.println(location+" celing fan is on "+this.level);
	}
	public void low() {
		this.level = LOW;
		System.out.println(location+" celing fan is on "+this.level);
	}
	public void off() {
		this.level = OFF;
		System.out.println(location+" celing fan is on "+this.level);
	}


}
