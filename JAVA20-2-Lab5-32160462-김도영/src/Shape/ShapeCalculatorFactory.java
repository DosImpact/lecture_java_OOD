package Shape;

public class ShapeCalculatorFactory {
	// mode �� ���� 2D,3D  Calculator ����
	public static ShapeCalculator getShapeCalculator(int mode) {
		if(mode == 1) {
			return new Shape2DCalculator();
		}
		else if(mode == 2) {
			return new Shape3DCalculator();
		}
		else {
			return null;
		}
	}
	// mode �� ���� 2D,3D  Calculator�� ������ �ִ� Ÿ�Ե� ����
	public static String[] getShapNames(int mode) {
		if(mode == 1) {
			return Shape2DCalculator.names();
		} 
		else if(mode == 2) {
			return Shape3DCalculator.names();
		}
		else {
			return null;
		}
	}
}
