

// execute, undo 커맨트 인터페이스 선언.
public interface Command {
	void execute(Shape shape); 
	void undo(Shape shape);
}
