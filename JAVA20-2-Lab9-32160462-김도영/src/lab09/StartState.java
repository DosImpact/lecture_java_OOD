package lab09;


public class StartState implements State {
	DoubleParser doubleParser;
	
	// 시작 STATE
	public StartState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	// To integer 
	@Override
	public void plus() {
		// integer 기호를 +1 전환
		doubleParser.sign = 1;
		doubleParser.setState(doubleParser.getIntegerState());
	}

	@Override
	public void minus() {
		// integer 기호를 -1 전환
		doubleParser.sign = -1;
		doubleParser.setState(doubleParser.getIntegerState());
	}
	
	@Override
	public void digit() {
		// integer 정수자리에 숫자를 append
		doubleParser.value = doubleParser.ch - '0';
		doubleParser.setState(doubleParser.getIntegerState());
	}
	
	// To Decimal
	@Override
	public void dot() {
		// 소수점 자리를 처리하는 state로 넘어감
		doubleParser.power = 0.1;
		doubleParser.setState(doubleParser.getDecimalState());
	}

	// To 애러를 발생
	@Override
	public void other() {
		throw new NumberFormatException();
	}


}
