package Shape;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("lab05 MAINTEST");

		// ����ڷκ��� ��带 �Է¹޾�.
		System.out.println("please enter select 1 (shape2DCalculator) or 2 (shape3DCalculator)");
		int mode = UserInput.getIntegerBetween(1, 2);
		//mode �� ����, 2d,3d ���⸦ �������ش�.
		ShapeCalculator shapeCalculator = ShapeCalculatorFactory.getShapeCalculator(mode);
		//�ش� ���丮�� ������ �ִ� ������ �̸� �����´�.
		String[] names = ShapeCalculatorFactory.getShapNames(mode);
		// �ش� �̸����� ��ü�� �ν��Ͻ�ȭ �ؼ� ����� �غ���.
		for(String name:names) {
			shapeCalculator.calculate(name); // calculate 
		}
	}

}
