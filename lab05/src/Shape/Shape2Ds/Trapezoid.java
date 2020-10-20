package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * 사다리꼴 클래스
 * Trapezoid  top bottom  height
 * 넓이 : (top*bottom*height) /0.5;
 */
public class Trapezoid  extends Shape2D{

	private double top;
	private double bottom;
	private double height;
	
	public Trapezoid() {this(1,1,1);}
	
	public Trapezoid(double top, double bottom,double height) {
		this.top = top; 
		this.bottom = bottom;
		this.height = height;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return ((top*bottom) /0.5)*height;
	}
	// 도형의 이름 출력
	@Override
	public String getName() {
		return "Trapezoid";
	}
	// 사용자 입력 처리하기.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Trapezoid top:");
		this.top = UserInput.getDouble();
		System.out.print("Please enter Trapezoid bottom:");
		this.bottom = UserInput.getDouble();
		System.out.print("Please enter Trapezoid height:");
		this.height = UserInput.getDouble();
	}
}
