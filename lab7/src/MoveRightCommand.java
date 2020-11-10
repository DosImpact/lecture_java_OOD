

public class MoveRightCommand implements Command {
	// Command �������̽� ����

	// excute �� undo�� ��ݵ� �ۿ��Դϴ�.
	@Override
	public void execute(Shape shape) {
		shape.moveRight();
	}
	@Override
	public void undo(Shape shape) {
		shape.moveLeft();
	}
}
