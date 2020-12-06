package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * �ﰢ�� Ŭ����
 * Triangle  base height  
 * ���� : base*height / 2 ;
 */
public class Triangle extends Shape2D{

	private double base;
	private double height;
	
	public Triangle() {this(1,1);}
	
	public Triangle(double base, double height) {
		this.base = base; this.height = height;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return base*height / 2.0;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Triangle";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Triangle Base:");
		this.base = UserInput.getDouble();
		System.out.print("Please enter Triangle height:");
		this.height = UserInput.getDouble();
	}

}