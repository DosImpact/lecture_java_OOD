

public class MoveLeftCommand implements Command {
	// Command 인터페이스 구현

	// excute 와 undo는 상반된 작용입니다.
	@Override
	public void execute(Shape shape) {
		shape.moveLeft();
	}

	@Override
	public void undo(Shape shape) {
		shape.moveRight();
	}
}
