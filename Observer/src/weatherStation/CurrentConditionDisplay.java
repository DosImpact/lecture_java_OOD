package weatherStation;

public class CurrentConditionDisplay implements Observer, DisplayElement{

	
	
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	
	
	public CurrentConditionDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("current condition"+this.temp + " : "+ this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		display();
		
	}

}
