package Shape;

public abstract class Shape  {
	// Shape  객체는 이름,사용자입력,계산 결과를 구현해야 한다.
	public abstract String getName();
	public abstract void getUserInput();
	public void calculate() {
		System.out.println("calculate");
	}
}
