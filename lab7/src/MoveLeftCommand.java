

public class MoveLeftCommand implements Command {
	// Command �������̽� ����

	// excute �� undo�� ��ݵ� �ۿ��Դϴ�.
	@Override
	public void execute(Shape shape) {
		shape.moveLeft();
	}

	@Override
	public void undo(Shape shape) {
		shape.moveRight();
	}
}
