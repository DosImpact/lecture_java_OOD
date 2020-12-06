package Shape.shape3Ds;

import Shape.Shape3D;
import Shape.UserInput;

/*
 * �� Ŭ����
 * Sphere  radius    
 * ���� : (Math.PI * radius**3 ) 4/3 ;
 */
public class Sphere extends Shape3D {

	private double radius;
	
	public Sphere() {
		this(1);
	}
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getVolume());
	}
	@Override
	public double getVolume() {
		return (Math.PI * radius*radius*radius*4)/3 ;
	}
	// ������ �̸� ���
	@Override
	public String getName() {
		return "Sphere";
	}
	// ����� �Է� ó���ϱ�.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Sphere radius:");
		this.radius = UserInput.getDouble();
	}

}
