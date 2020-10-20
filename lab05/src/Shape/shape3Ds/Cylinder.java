package Shape.shape3Ds;

import Shape.Shape3D;
import Shape.UserInput;

/*
 * ����� Ŭ����
 * Cylinder  radius height   
 * ���� : PI*radius*radius*height
 */
public class Cylinder extends Shape3D {

	private double radius;
	private double height;
	
	public Cylinder() {
		this(1,1);
	}
	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getVolume());
	}
	@Override
	public double getVolume() {
		return Math.PI*radius*radius*height ;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Cylinder";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Cylinder radius:");
		this.radius = UserInput.getDouble();
		System.out.print("Please enter Cylinder height:");
		this.height = UserInput.getDouble();
	}

}
