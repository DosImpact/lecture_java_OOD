import java.util.Date;

// display current condition of weather data
public class CurrentConditionsDisplay {
	private Date dateTime = null;
	private double temperature = 0.0; // (celsius)
	private double windVelocity = 0.0; // (m/s)
	private double relativeHumidity = 0.0; // (%)
    
	@Override
	public String toString() {
		return "CurrentConditionsDisplay [dateTime=" + dateTime + ", temperature=" + temperature + ", windVelocity="
				+ windVelocity + ", relativeHumidity=" + relativeHumidity + "]";
	}
}
