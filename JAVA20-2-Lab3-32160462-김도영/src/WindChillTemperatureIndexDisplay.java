import java.util.Date;

// http://www.kma.go.kr/HELP/basic/help_01_07.jsp
// WindChillTemperatureIndex (KPARK 2020/09/27)
enum WindChillTemperatureIndex {
	DANGER, WARNING, CAUTION, AWARE;
}

public class WindChillTemperatureIndexDisplay implements Observer, DisplayElement {
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

	@Override
	public void display() {
		System.out.println(this);//toString 실행
	}

	@Override
	public void update(Date dateTime, double temp, double velocity, double humidity) {
		// subject에서 업데이트 신호가 오면, 데이터를 가공 및 저장 후에 display 실행
		double result =  WindChillTemperatureIndexDisplay.calculate(temp, velocity);
		if( result < -45 ) {
			this.index = WindChillTemperatureIndex.DANGER;
		}
		else if ( result < -25 ) {
			this.index = WindChillTemperatureIndex.WARNING;
		}
		else if ( result < -10 ) {
			this.index = WindChillTemperatureIndex.CAUTION;
		}
		else {
			this.index = WindChillTemperatureIndex.AWARE;
		}
		display();
		
	}
	
	@Override
	public boolean equals(Object o){ // indexOf를 결정하기 위한 코드
		return ( o instanceof WindChillTemperatureIndexDisplay);
	}
}
