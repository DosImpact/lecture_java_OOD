package undo.command;

// Ŀ�ǵ� ������ �������̽�
public interface Command {
	void execute();
	void undo();
}
