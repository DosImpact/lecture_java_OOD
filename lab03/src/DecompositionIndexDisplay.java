import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_03_01.jsp
// DecompositionIndex (KPARK 2020/09/27)
enum DecompositionIndex {
	HIGH, NORMAL, LOW;
}

public class DecompositionIndexDisplay implements Observer, DisplayElement  {
	private DecompositionIndex index = null;

	// DecompositionIndex = (RH - 65)/14 * (1.054^T) [RH: relativeHumidity (%), T: temperature (celsius)]
	public static double calculate(double T, double RH) {
		double value = (RH - 65.0)/14.0 * Math.pow(1.054, T);
        value = Math.round(value * 100) / 100.0; // �Ҽ��� ��°�ڸ� �ݿø�
        return value;
	}
	
	@Override
	public String toString() {
		return "DecompositionIndexDisplay [index=" + index + "]";
	}

	@Override
	public void display() {
		System.out.println(this);
	}

	@Override
	public void update(Date dateTime, double temp, double velocity, double humidity) {
		double result =  DecompositionIndexDisplay.calculate(temp, humidity);
		if( result >= 7 ) {
			this.index = DecompositionIndex.HIGH;
		}
		else if( result >= 3 ) {
			this.index = DecompositionIndex.NORMAL;
		}
		else {
			this.index = DecompositionIndex.LOW;
		}
		display();
		
	}
	@Override
	public boolean equals(Object o){
		return ( o instanceof DecompositionIndexDisplay);
	}
}
