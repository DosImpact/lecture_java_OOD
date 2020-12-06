package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * ���簢�� Ŭ����
 * Rectangle  base,height
 * ���� : base*height
 */
public class Rectangle  extends Shape2D{

	private double base;
	private double height;
	
	public Rectangle() {this(1,1);}
	
	public Rectangle(double base, double height) {
		this.base = base; this.height = height;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return base*height ;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Rectangle";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Rectangle Base:");
		this.base = UserInput.getDouble();
		System.out.print("Please enter Rectangle height:");
		this.height = UserInput.getDouble();
	}

}
