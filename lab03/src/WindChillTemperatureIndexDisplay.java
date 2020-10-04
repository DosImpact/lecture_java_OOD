import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_07.jsp
// WindChillTemperatureIndex (KPARK 2020/09/27)
enum WindChillTemperatureIndex {
	DANGER, WARNING, CAUTION, AWARE;
}

public class WindChillTemperatureIndexDisplay {
	private WindChillTemperatureIndex index = null;

	// (Km/h) 1 m/s = 3.6 Km/h = (1/1000) Km / (1/3600) h
    static double fromMStoKMH(double ms) {
    	return ms * 3.6;
    }

    static double fromKMHtoMS(double kmh) {
    	return kmh / 3.6;
    }

	public static double calculate(double T, double W) {
		double V = fromMStoKMH(W);
		double value = 0.0;
        if (V > 4.8) {
    		value = 13.12 + 0.6215*T - 11.37 * Math.pow(V, 0.16) + 0.3965 * Math.pow(V, 0.16) * T;
            if (value > T) {
                value = T;
            }
        }
        else {
            value = T;
        }
		value = Math.round(value);
		return value;
	}
	
	@Override
	public String toString() {
		return "WindChillTemperatureIndexDisplay [index=" + index + "]";
	}
}
