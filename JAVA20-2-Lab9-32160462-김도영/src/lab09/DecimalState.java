package lab09;

public class DecimalState implements State {
	DoubleParser doubleParser;
	
	public DecimalState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}

	@Override
	public void digit() {
		// integer 소수점을 연장시키는 로직
		doubleParser.value +=  (doubleParser.power)*(doubleParser.ch - '0');
		doubleParser.power /= 10; 
		doubleParser.setState(doubleParser.getDecimalState());
	}
	
	//애러를 발생
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
	@Override
	public void dot() {
		throw new NumberFormatException();
	}

}
