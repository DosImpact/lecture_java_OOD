package Shape.shape3Ds;

import Shape.Shape3D;
import Shape.UserInput;

/*
 * ���� Ŭ����
 * Cone  radius height  
 * ���� : PI * radius*radius*height / 3 ;
 */
public class Cone extends Shape3D {

	private double radius;
	private double height;
	
	public Cone() {
		this(1,1);
	}
	public Cone(double radius, double height) {
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
		return (Math.PI * radius*radius*height)/3 ;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Cone";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Cone radius:");
		this.radius = UserInput.getDouble();
		System.out.print("Please enter Cone height:");
		this.height = UserInput.getDouble();
	}

}
