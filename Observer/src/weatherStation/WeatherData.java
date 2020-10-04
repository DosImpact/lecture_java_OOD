package weatherStation;

import java.util.ArrayList;

public class WeatherData  implements Subject {
	


	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public void setMeasurements(float temp,float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		
	}
	public void measurementsChanged() {
		notifyObserver();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
		
	}
	
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i =  this.observers.indexOf(o);
		if( i  >= 0 ) this.observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for ( Observer o: this.observers) {
			o.update(temp,humidity,pressure);
		}
	}

}
