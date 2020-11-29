package lab09;


public class StartState implements State {
	DoubleParser doubleParser;
	
	
	public StartState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	// To integer
	@Override
	public void plus() {
		// integer
		doubleParser.sign = 1;
		doubleParser.setState(doubleParser.getIntegerState());
	}

	@Override
	public void minus() {
		// integer
		doubleParser.sign = -1;
		doubleParser.setState(doubleParser.getIntegerState());
	}
	
	@Override
	public void digit() {
		// integer
		doubleParser.value = doubleParser.ch - '0';
		doubleParser.setState(doubleParser.getIntegerState());
	}
	
	// To Decimal
	@Override
	public void dot() {
		doubleParser.power = 0.1;
		doubleParser.setState(doubleParser.getDecimalState());
	}

	// To 애러를 발생
	@Override
	public void other() {
		
		throw new NumberFormatException();
	}


}
