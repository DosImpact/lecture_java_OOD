import java.util.Date;

// display current condition of weather data
public class CurrentConditionsDisplay  implements Observer, DisplayElement {
	private Date dateTime = null;
	private double temperature = 0.0; // (celsius)
	private double windVelocity = 0.0; // (m/s)
	private double relativeHumidity = 0.0; // (%)
    
	@Override
	public String toString() {
		return "CurrentConditionsDisplay [dateTime=" + dateTime + ", temperature=" + temperature + ", windVelocity="
				+ windVelocity + ", relativeHumidity=" + relativeHumidity + "]";
	}

	@Override
	public void display() {
		System.out.println(this); //toString 실행
	}

	@Override
	public void update(Date dateTime, double temp, double velocity, double humidity) {
		// subject에서 업데이트 신호가 오면, 데이터를 가공 및 저장 후에 display 실행
		this.dateTime = dateTime;
		this.temperature = temp;
		this.windVelocity = velocity;
		this.relativeHumidity = humidity;
		display();  
	}
	
	@Override
	public boolean equals(Object o){
		return ( o instanceof CurrentConditionsDisplay); // indexOf를 결정하기 위한 코드
	}
}
