package lab09;

public class DoubleParser {
	State startState;
	State integerState;
	State decimalState;
	State state;
	
	double sign;
	double value;
	double power;
	char ch;
	
	public DoubleParser() {
		 this.startState = new StartState(this);
		 this.integerState = new  IntegerState(this);
		 this.decimalState= new DecimalState(this); 
		 this.state = this.startState;
	}
	private void init() {
		this.state = this.startState;
		this.sign = 1;
		this.value = 0;
		this.power = 0.1;
		this.ch = ' ';
	
	}
	// 입력으로   + |  - | .  | 숫자들  |  그외들
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
	
//	public State getState() {
//		return state;
//	}
	public void setState(State state) {
		this.state = state;
	}
	
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
