

public class MoveDownCommand implements Command {
	// Command 인터페이스 구현

	// excute 와 undo는 상반된 작용입니다.
	@Override
	public void execute(Shape shape) {
		shape.moveDown();
	}

	@Override
	public void undo(Shape shape) {
		shape.moveUp();
	}

}
