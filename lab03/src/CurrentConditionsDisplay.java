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
		System.out.println(this);
	}

	@Override
	public void update(Date dateTime, double temp, double velocity, double humidity) {
		this.dateTime = dateTime;
		this.temperature = temp;
		this.windVelocity = velocity;
		this.relativeHumidity = humidity;
		display();  
	}
	
	@Override
	public boolean equals(Object o){
		return ( o instanceof CurrentConditionsDisplay);
	}
}
