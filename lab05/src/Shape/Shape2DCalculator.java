package Shape;

import Shape.Shape2Ds.Kite;
import Shape.Shape2Ds.Paralleogram;
import Shape.Shape2Ds.Rectangle;
import Shape.Shape2Ds.Square;
import Shape.Shape2Ds.Trapezoid;
import Shape.Shape2Ds.Triangle;

public class Shape2DCalculator extends ShapeCalculator {
	// Shape2DCalculator �� ������ �ִ� Ÿ�Ե� ���� �� ����
	static String[] names = {"Triangle","Kite","Paralleogram","Rectangle","Square","Trapezoid"};
	
	public static String[] names() {
		return Shape2DCalculator.names;
	}

	// type�� ���� ���� ����
	@Override
	public Shape createShape(String name) {
		if(name == "Triangle") return new Triangle();
		if(name == "Kite") return new Kite();
		if(name == "Paralleogram") return new Paralleogram();
		if(name == "Square") return new Square();
		if(name == "Rectangle") return new Rectangle();
		if(name == "Trapezoid") return new Trapezoid();
		
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
