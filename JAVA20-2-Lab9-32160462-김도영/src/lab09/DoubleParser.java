package lab09;

public class DoubleParser {
	// 3���� ���¿� 4���� �������̸� ������.
	State startState;
	State integerState;
	State decimalState;
	State state;	// ���� ����
	
	double sign;	// ���� ������ ������
	double value;
	double power;
	char ch;
	
	public DoubleParser() {
		 this.startState = new StartState(this);
		 this.integerState = new  IntegerState(this);
		 this.decimalState= new DecimalState(this); 
		 this.state = this.startState;
	}
	// ���¿� ���� �ʱ�ȭ ��Ų��.
	private void init() {
		this.state = this.startState;
		this.sign = 1;
		this.value = 0;
		this.power = 0.1;
		this.ch = ' ';
	
	}
	// �Է�����   + |  - | .  | ���ڵ�  |  �׿ܵ�
	// ������� �Ľ̵� ����� ����
	public double toDouble(String str) {
		this.init();
		int i = 0;
		while( i < str.length()) {
			ch = str.charAt(i++);
			if( ch == '.') state.dot();
			else if( ch == '+') state.plus();
			else if( ch == '-') state.minus();
			else if( Character.isDigit(ch)) state.digit();
			else state.other();
		}
		return sign*value;
	}
	
	// ���¸� setter
	public void setState(State state) {
		this.state = state;
	}
	// ���¸� getter
	public State getStartState() {
		return startState;
	}
	public State getIntegerState() {
		return integerState;
	}
	public State getDecimalState() {
		return decimalState;
	}
}
