
public interface State {
	// Off low mid high 4개의 상태를 가지며
	// pull 이라는 전이 액션 1개를 가진다.
	void pull();
}
