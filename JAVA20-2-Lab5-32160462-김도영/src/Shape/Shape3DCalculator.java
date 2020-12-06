package Shape;

import Shape.shape3Ds.Cone;
import Shape.shape3Ds.Cuboid;
import Shape.shape3Ds.Cylinder;
import Shape.shape3Ds.Pyramid;
import Shape.shape3Ds.Sphere;

public class Shape3DCalculator extends ShapeCalculator {
	// Shape3DCalculator 가 가지고 있는 타입들 선언 및 리턴
	static String[] names = {"Cuboid","Cylinder","Sphere","Pyramid","Cone"};
	
	public static String[] names() {
		return Shape3DCalculator.names;
	}
	
	// type에 따른 도형 생성
	@Override
	public Shape createShape(String name) {
		if(name == "Cuboid") return new Cuboid();
		if(name == "Cylinder") return new Cylinder();
		if(name == "Sphere") return new Sphere();
		if(name == "Pyramid") return new Pyramid();
		if(name == "Cone") return new Cone();
		
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
