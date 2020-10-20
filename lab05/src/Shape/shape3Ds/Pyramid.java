package Shape.shape3Ds;

import Shape.Shape3D;
import Shape.UserInput;

/*
 * 삼각뿔 클래스
 * Pyramid  base height   
 * 부피 : (base*base*height)/3 ;
 */
public class Pyramid extends Shape3D {

	private double base;
	private double height;
	
	public Pyramid() {
		this(1,1);
	}
	public Pyramid(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public void calculate() {
		System.out.println("[calculate "+this.getName()+" ]: "+this.getVolume());
	}
	@Override
	public double getVolume() {
		return (base*base*height)/3 ;
	}
	// 도형의 이름 출력
	@Override
	public String getName() {
		return "Pyramid";
	}
	// 사용자 입력 처리하기.
	@Override
	public void getUserInput() {
		System.out.print("Please enter Pyramid base:");
		this.base = UserInput.getDouble();
		System.out.print("Please enter Pyramid height:");
		this.height = UserInput.getDouble();
	}

}
