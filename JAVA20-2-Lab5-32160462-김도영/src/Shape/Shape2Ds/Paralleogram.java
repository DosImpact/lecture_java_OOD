package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * ����纯�� Ŭ����
 * Paralleogram  base,height
 * ���� : base*height
 */
public class Paralleogram  extends Shape2D{

	private double base;
	private double height;
	
	public Paralleogram() {this(1,1);}
	
	public Paralleogram(double base, double height) {
		this.base = base; this.height = height;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return base*height;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Paralleogram";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Paralleogram Base:");
		this.base = UserInput.getDouble();
		System.out.print("Please enter Paralleogram height:");
		this.height = UserInput.getDouble();
	}
}
