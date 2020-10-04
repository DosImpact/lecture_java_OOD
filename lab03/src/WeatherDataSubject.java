import java.util.Date;
import java.util.ArrayList;

public class WeatherDataSubject implements Subject,Runnable {

	private ArrayList<WeatherData> data = null;
	private ArrayList<Observer> observers = null;
	
	public WeatherDataSubject() {
		super();
		this.data = new ArrayList<WeatherData>();
		this.observers =  new ArrayList<Observer>();;
	}
	
	private void appendRandomWeatherData() {
	
	}


	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			try {
				Thread.sleep(1000);				// 1 sec sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.appendRandomWeatherData();		// add Random DATA
			this.notifyObserver();
		}
	}

	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if(i >= 0) this.observers.remove(i);
	}

	@Override
	public void notifyObserver() {				//날씨정보를 업데이트하고, 리스트의 마지막에 들어온 정보로 notify
		WeatherData ld = data.get(data.size() - 1);
		for(Observer o:this.observers) {//ArrayList 마지막리스트 넘버의 요소데이터로 update 실행
			o.update(ld.getDateTime(), ld.getTemperature(), ld.getWindVelocity(), ld.getRelativeHumidity());
		}
	}



}
