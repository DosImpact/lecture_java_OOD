package doubleParser;

public class DoubleParser {
	StartState startState;
	IntegerState integerState;
	DecimalState decimalState;
	State state;
	
	public double sign;
	public double value;
	public double p;
	
	
	
	public StartState getStartState() {
		return startState;
	}
	public IntegerState getIntegerState() {
		return integerState;
	}
	public DecimalState getDecimalState() {
		return decimalState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}
