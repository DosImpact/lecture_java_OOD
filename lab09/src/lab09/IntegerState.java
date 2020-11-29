package lab09;

public class IntegerState implements State {
	DoubleParser doubleParser;
	
	public IntegerState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	// To integer
	@Override
	public void digit() {
		// integer
		doubleParser.value =  10*doubleParser.value +  (doubleParser.ch - '0');
		doubleParser.setState(doubleParser.getIntegerState());
	}
	// To Deciaml
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
	@Override
	public void plus() {
		throw new NumberFormatException();
	}

	@Override
	public void minus() {
		throw new NumberFormatException();
	}

}
