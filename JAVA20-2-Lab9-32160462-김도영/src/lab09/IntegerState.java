package lab09;

public class IntegerState implements State {
	DoubleParser doubleParser;
	
	public IntegerState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	// To integer
	@Override
	public void digit() {
		// integer 정수형 자리를 append 하는 로직
		doubleParser.value =  10*doubleParser.value +  (doubleParser.ch - '0');
		doubleParser.setState(doubleParser.getIntegerState());
	}
	// To Deciaml
	@Override
	public void dot() {
		// deciaml 소수점 처리를 하는 상태로 전이
		doubleParser.power = 0.1;
		doubleParser.setState(doubleParser.getDecimalState());
	}
	
	// To 애러를 발생
	@Override
	public void other() {
		throw new NumberFormatException();
	
	}
	@Override
	public void plus() {
		throw new NumberFormatException();
	}

	@Override
	public void minus() {
		throw new NumberFormatException();
	}

}
