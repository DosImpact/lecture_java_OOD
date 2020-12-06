package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * ���簢�� Ŭ����
 * Square  side
 * ���� : side*side
 */
public class Square  extends Shape2D{

	private double side;
	public Square() {this(1);}
	
	public Square(double side) {
		this.side = side;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return side*side;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Square";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Square side:");
		this.side = UserInput.getDouble();
	}

}
