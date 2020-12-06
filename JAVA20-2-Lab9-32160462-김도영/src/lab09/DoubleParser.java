package lab09;

public class DoubleParser {
	// 3가지 상태와 4가지 상태전이를 가진다.
	State startState;
	State integerState;
	State decimalState;
	State state;	// 현재 상태
	
	double sign;	// 현재 상태의 변수값
	double value;
	double power;
	char ch;
	
	public DoubleParser() {
		 this.startState = new StartState(this);
		 this.integerState = new  IntegerState(this);
		 this.decimalState= new DecimalState(this); 
		 this.state = this.startState;
	}
	// 상태와 값을 초기화 시킨다.
	private void init() {
		this.state = this.startState;
		this.sign = 1;
		this.value = 0;
		this.power = 0.1;
		this.ch = ' ';
	
	}
	// 입력으로   + |  - | .  | 숫자들  |  그외들
	// 출력으로 파싱된 결과를 리턴
	public double toDouble(String str) {
		this.init();
		int i = 0;
		while( i < str.length()) {
			ch = str.charAt(i++);
			if( ch == '.') state.dot();
			else if( ch == '+') state.plus();
			else if( ch == '-') state.minus();
			else if( Character.isDigit(ch)) state.digit();
			else state.other();
		}
		return sign*value;
	}
	
	// 상태를 setter
	public void setState(State state) {
		this.state = state;
	}
	// 상태를 getter
	public State getStartState() {
		return startState;
	}
	public State getIntegerState() {
		return integerState;
	}
	public State getDecimalState() {
		return decimalState;
	}
}
