package doubleParser;

public class DecimalState implements State {
	DoubleParser doubleParser;
	public DecimalState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}

	
	// Decimal
	@Override
	public void digit() {
	}

	// exception
	@Override
	public void plus() {throw new NumberFormatException();
	}

	@Override
	public void minus() {throw new NumberFormatException();
	}

	@Override
	public void dot() {throw new NumberFormatException();
	}

	@Override
	public void other() {throw new NumberFormatException();
	}

}
