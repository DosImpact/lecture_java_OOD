package weatherStation;

public class ThirdPartyDisplay implements Observer, DisplayElement{

	
	
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	
	
	public ThirdPartyDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ThirdPartyDisplay "+this.temp + " : "+ this.humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		display();
		
	}

}
