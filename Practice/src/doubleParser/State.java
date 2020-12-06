package doubleParser;

public interface State {
	// 3개의 State > Class로 구체화
	// 5개의 전이
	void digit();
	void plus();
	void minus();
	void dot();
	void other();
}
