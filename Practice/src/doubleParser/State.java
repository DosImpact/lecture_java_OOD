package doubleParser;

public interface State {
	// 3���� State > Class�� ��üȭ
	// 5���� ����
	void digit();
	void plus();
	void minus();
	void dot();
	void other();
}
