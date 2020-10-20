package Shape;

//ShapeCalculator 는 팩토리 패턴에서의 핵심 추상 클래스이며,
// createShape에서 타입별로 클래스틑 인스턴스화 하고
// 생성된 클래스를 calculate 함수에서, 사용자의 입력을 받고 실제 도형에서  calculate 한 결과를 출력합니다.
public abstract class ShapeCalculator {
	public abstract Shape createShape(String name);
	public abstract void calculate(String name);
}
