package Shape;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("lab05 MAINTEST");

		// 사용자로부터 모드를 입력받아.
		System.out.println("please enter select 1 (shape2DCalculator) or 2 (shape3DCalculator)");
		int mode = UserInput.getIntegerBetween(1, 2);
		//mode 에 따라서, 2d,3d 계산기를 리턴해준다.
		ShapeCalculator shapeCalculator = ShapeCalculatorFactory.getShapeCalculator(mode);
		//해당 팩토리가 가지고 있는 도형의 이름 가져온다.
		String[] names = ShapeCalculatorFactory.getShapNames(mode);
		// 해당 이름으로 객체를 인스턴스화 해서 계산을 해본다.
		for(String name:names) {
			shapeCalculator.calculate(name); // calculate 
		}
	}

}
