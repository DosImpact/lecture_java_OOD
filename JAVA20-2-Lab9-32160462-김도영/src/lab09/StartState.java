package lab09;


public class StartState implements State {
	DoubleParser doubleParser;
	
	// ���� STATE
	public StartState(DoubleParser doubleParser) {
		this.doubleParser = doubleParser;
	}
	// To integer 
	@Override
	public void plus() {
		// integer ��ȣ�� +1 ��ȯ
		doubleParser.sign = 1;
		doubleParser.setState(doubleParser.getIntegerState());
	}

	@Override
	public void minus() {
		// integer ��ȣ�� -1 ��ȯ
		doubleParser.sign = -1;
		doubleParser.setState(doubleParser.getIntegerState());
	}
	
	@Override
	public void digit() {
		// integer �����ڸ��� ���ڸ� append
		doubleParser.value = doubleParser.ch - '0';
		doubleParser.setState(doubleParser.getIntegerState());
	}
	
	// To Decimal
	@Override
	public void dot() {
		// �Ҽ��� �ڸ��� ó���ϴ� state�� �Ѿ
		doubleParser.power = 0.1;
		doubleParser.setState(doubleParser.getDecimalState());
	}

	// To �ַ��� �߻�
	@Override
	public void other() {
		throw new NumberFormatException();
	}


}
