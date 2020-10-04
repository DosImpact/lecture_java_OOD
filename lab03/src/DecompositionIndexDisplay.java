import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_03_01.jsp
// DecompositionIndex (KPARK 2020/09/27)
enum DecompositionIndex {
	HIGH, NORMAL, LOW;
}

public class DecompositionIndexDisplay {
	private DecompositionIndex index = null;

	// DecompositionIndex = (RH - 65)/14 * (1.054^T) [RH: relativeHumidity (%), T: temperature (celsius)]
	public static double calculate(double T, double RH) {
		double value = (RH - 65.0)/14.0 * Math.pow(1.054, T);
        value = Math.round(value * 100) / 100.0; // 소수점 두째자리 반올림
        return value;
	}
	
	@Override
	public String toString() {
		return "DecompositionIndexDisplay [index=" + index + "]";
	}
}
