package Shape;

public abstract class Shape  {
	// Shape  ��ü�� �̸�,������Է�,��� ����� �����ؾ� �Ѵ�.
	public abstract String getName();
	public abstract void getUserInput();
	public void calculate() {
		System.out.println("calculate");
	}
}
