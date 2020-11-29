package ceilingfan;

public class CeilingFan {
	public static final int OFF = 0 ;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	int state = OFF;
		
	public CeilingFan() {
		this.state = OFF;
	}
	
	public void off() {
		this.state = OFF;
	}
	
	public void low() {
		this.state = LOW;
	}
	public void medium() {
		this.state = MEDIUM;
	}
	public void high() {
		this.state = HIGH;
	}
	public void pull() {
		switch (this.state) {
		case OFF:
			System.out.println("off");
			low();
			break;
		case LOW:
			System.out.println("low");
			medium();
			break;
		case MEDIUM:
			System.out.println("medium");
			high();
			break;
		case HIGH:
			System.out.println("high");
			off();
			break;
		default:
			break;
		}
	}

}
