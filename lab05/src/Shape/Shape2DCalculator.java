package Shape;

import Shape.Shape2Ds.Kite;
import Shape.Shape2Ds.Paralleogram;
import Shape.Shape2Ds.Rectangle;
import Shape.Shape2Ds.Square;
import Shape.Shape2Ds.Trapezoid;
import Shape.Shape2Ds.Triangle;

public class Shape2DCalculator extends ShapeCalculator {
	// Shape2DCalculator 가 가지고 있는 타입들 선언 및 리턴
	static String[] names = {"Triangle","Kite","Paralleogram","Rectangle","Square","Trapezoid"};
	
	public static String[] names() {
		return Shape2DCalculator.names;
	}

	// type에 따른 도형 생성
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
	// type에 따른 도형 생성 후 userInput 후에 계산 결과 출력
	@Override
	public void calculate(String name) {
		// shape를 생성하고
		Shape shape = createShape(name);
		if(shape ==null) {
			System.out.println("error : no shape");
			return;
		}
		// shape의 getUserinput를 호출
		shape.getUserInput();
		// shape의 calcuator를 호출한다.
		shape.calculate();
	}
	
}
