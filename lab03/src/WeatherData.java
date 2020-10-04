import java.text.SimpleDateFormat;
import java.util.Date;

// WeatherData (KPARK 2020/09/27)
public class WeatherData {
	

	protected Date dateTime = null;
	protected double temperature = 0.0; // (celsius)
	protected double windVelocity = 0.0; // (m/s)
	protected double relativeHumidity = 0.0; // (%)
	
	
	public WeatherData(Date dateTime, double temperature, double windVelocity, double relativeHumidity) {
		super();
		this.dateTime = dateTime;
		this.temperature = temperature;
		this.windVelocity = windVelocity;
		this.relativeHumidity = relativeHumidity;
	
	}
	
	public Date getDateTime() {
		return dateTime;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getWindVelocity() {
		return windVelocity;
	}

	public double getRelativeHumidity() {
		return relativeHumidity;
	}
	

	@Override
	public String toString() {
		return "" + dateTime + "," + temperature + "," + windVelocity + "," + relativeHumidity;
	}	
}
