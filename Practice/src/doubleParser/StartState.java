package doubleParser;

public class StartState implements State {
	DoubleParser doubleParser;
	public StartState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	
	// Start
	
	// Integer
	@Override
	public void digit() {
	}

	@Override
	public void plus() {
	}

	@Override
	public void minus() {
	}
	// Decimal
	@Override
	public void dot() {
		
	}

	@Override
	public void other() {
		throw new NumberFormatException();
	}

}
