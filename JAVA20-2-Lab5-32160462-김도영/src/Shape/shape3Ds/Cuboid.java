package Shape.shape3Ds;

import Shape.Shape3D;
import Shape.UserInput;
/*
 * ������ü Ŭ����
 * Cuboid  width height   length
 * ���� : width*height*height
 */

public class Cuboid extends Shape3D {

	private double width;
	private double height;
	private double length;
	
	public Cuboid() {
		this(1,1,1);
	}
	public Cuboid(double width, double height,double length) {
		super();
		this.width = width;
		this.height = height;
		this.length = length;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getVolume());
	}
	@Override
	public double getVolume() {
		return width*height*height;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Cuboid";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Cuboid width:");
		this.width = UserInput.getDouble();
		System.out.print("Please enter Cuboid height:");
		this.height = UserInput.getDouble();
		System.out.print("Please enter Cuboid length:");
		this.length = UserInput.getDouble();
	}

}
