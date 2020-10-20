package Shape;

//ShapeCalculator �� ���丮 ���Ͽ����� �ٽ� �߻� Ŭ�����̸�,
// createShape���� Ÿ�Ժ��� Ŭ�����z �ν��Ͻ�ȭ �ϰ�
// ������ Ŭ������ calculate �Լ�����, ������� �Է��� �ް� ���� ��������  calculate �� ����� ����մϴ�.
public abstract class ShapeCalculator {
	public abstract Shape createShape(String name);
	public abstract void calculate(String name);
}
