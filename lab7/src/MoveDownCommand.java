

public class MoveDownCommand implements Command {
	// Command �������̽� ����

	// excute �� undo�� ��ݵ� �ۿ��Դϴ�.
	@Override
	public void execute(Shape shape) {
		shape.moveDown();
	}

	@Override
	public void undo(Shape shape) {
		shape.moveUp();
	}

}
