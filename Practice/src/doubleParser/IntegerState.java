package doubleParser;

public class IntegerState implements State {
	DoubleParser doubleParser;
	public IntegerState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	// Start
	
	// Integer
	@Override
	public void digit() {
	}

	// Decimal
	@Override
	public void dot() {
	}


	// Exception
	@Override
	public void other() {throw new NumberFormatException();
	}

	@Override
	public void plus() {throw new NumberFormatException();
	}

	@Override
	public void minus() {throw new NumberFormatException();
	}


}
