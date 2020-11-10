

public class MoveRightCommand implements Command {
	// Command 인터페이스 구현

	// excute 와 undo는 상반된 작용입니다.
	@Override
	public void execute(Shape shape) {
		shape.moveRight();
	}
	@Override
	public void undo(Shape shape) {
		shape.moveLeft();
	}
}
