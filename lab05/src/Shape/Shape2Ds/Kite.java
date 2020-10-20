package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * ������ Ŭ����
 * Kite  horizontalDiagonal,verticalDiagonal
 * ���� : horizontalDiagonal*verticalDiagonal / 2 ;
 */
public class Kite  extends Shape2D{
	
	private double horizontalDiagonal;
	private double verticalDiagonal;
	
	public Kite() {this(1,1);}
	
	public Kite(double horizontalDiagonal, double verticalDiagonal) {
		this.horizontalDiagonal = horizontalDiagonal; 
		this.verticalDiagonal = verticalDiagonal;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return horizontalDiagonal*verticalDiagonal / 2.0;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Kite";
	}

	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Kite horizontalDiagonal:");
		this.horizontalDiagonal = UserInput.getDouble();
		System.out.print("Please enter Kite verticalDiagonal:");
		this.verticalDiagonal = UserInput.getDouble();
	}

}
