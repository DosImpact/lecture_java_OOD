package Shape;

import Shape.shape3Ds.Cone;
import Shape.shape3Ds.Cuboid;
import Shape.shape3Ds.Cylinder;
import Shape.shape3Ds.Pyramid;
import Shape.shape3Ds.Sphere;

public class Shape3DCalculator extends ShapeCalculator {
	// Shape3DCalculator �� ������ �ִ� Ÿ�Ե� ���� �� ����
	static String[] names = {"Cuboid","Cylinder","Sphere","Pyramid","Cone"};
	
	public static String[] names() {
		return Shape3DCalculator.names;
	}
	
	// type�� ���� ���� ����
	@Override
	public Shape createShape(String name) {
		if(name == "Cuboid") return new Cuboid();
		if(name == "Cylinder") return new Cylinder();
		if(name == "Sphere") return new Sphere();
		if(name == "Pyramid") return new Pyramid();
		if(name == "Cone") return new Cone();
		
		return null;
	}
	// type�� ���� ���� ���� �� userInput �Ŀ� ��� ��� ���
	@Override
	public void calculate(String name) {
		// shape�� �����ϰ�
		Shape shape = createShape(name);
		if(shape ==null) {
			System.out.println("error : no shape");
			return;
		}
		// shape�� getUserinput�� ȣ��
		shape.getUserInput();
		// shape�� calcuator�� ȣ���Ѵ�.
		shape.calculate();
	}
	
}
