package weatherStation;

public class MainTest {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(40, 21, 100);
		weatherData.setMeasurements(40, 21, 300);
		weatherData.setMeasurements(41230, 121, 400);
		
	}

}
