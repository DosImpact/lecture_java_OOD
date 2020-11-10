

public class MoveUpCommand implements Command {
	// Command �������̽� ����

	// excute �� undo�� ��ݵ� �ۿ��Դϴ�.
	@Override
	public void execute(Shape shape) {
		shape.moveUp();
	}
	@Override
	public void undo(Shape shape) {
		shape.moveDown();
	}
}
