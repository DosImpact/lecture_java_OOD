package Shape.Shape2Ds;

import Shape.Shape2D;
import Shape.UserInput;
/*
 * 정사각형 클래스
 * Square  side
 * 넓이 : side*side
 */
public class Square  extends Shape2D{

	private double side;
	public Square() {this(1);}
	
	public Square(double side) {
		this.side = side;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getArea());
	}
	@Override
	public double getArea() {
		return side*side;
	}
	// 도형의 이름 출력
	@Override
	public String getName() {
		return "Square";
	}
	// 사용자 입력 처리하기.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Square side:");
		this.side = UserInput.getDouble();
	}

}
