package Shape;

public class ShapeCalculatorFactory {
	// mode 에 따라서 2D,3D  Calculator 리턴
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
	// mode 에 따라서 2D,3D  Calculator가 가지고 있는 타입들 리턴
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
