import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class WeatherDataSubject implements Subject,Runnable {

	private ArrayList<WeatherData> data = null;
	private ArrayList<Observer> observers = null;
	private List<WeatherData> list = null;
	
	public WeatherDataSubject() {
		super();
		this.data = new ArrayList<WeatherData>();
		this.observers =  new ArrayList<Observer>();
		this.list = WeatherDataImporter.loadCSV("/Users/doyoung/eclipse-workspace/lecture_java_OOD/lab03/OBS_ASOS_DD_20200924113100.csv");
    	
//    	for(WeatherData l : list) {
//    		System.out.println(l); // 일시,평균기온(°C),평균 풍속(m/s),평균 상대습도(%)
//    	}
	}
	
	private void appendWeatherData(int i) {
		data.add(this.list.get(i));
	}


	@Override
	public void run() {
		for(int i = 0 ; i < list.size() ; i++) {
			try {
				Thread.sleep(10);				// 1 sec sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if( i == 2) this.addObserver(new CurrentConditionsDisplay());
			if( i == 4)	this.addObserver(new HeatIndexDisplay());
			if( i == 6)	this.addObserver(new WindChillTemperatureIndexDisplay());
			if( i == 8)	this.addObserver(new DecompositionIndexDisplay());
			this.appendWeatherData(i);		// add Random DATA
			this.notifyObserver();
			if( i == list.size() - 2) 	this.removeObserver(new CurrentConditionsDisplay());
			if( i == list.size() - 4)	this.removeObserver(new HeatIndexDisplay());
			if( i == list.size() - 6)	this.removeObserver(new WindChillTemperatureIndexDisplay());
			if( i == list.size() - 8)	this.removeObserver(new DecompositionIndexDisplay());
		}
	}

	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
//		System.out.println("removeObserver : "+i);
		if(i >= 0) this.observers.remove(i);
	}

	@Override
	public void notifyObserver() {				//날씨정보를 업데이트하고, 리스트의 마지막에 들어온 정보로 notify
		WeatherData ld = data.get(data.size() - 1);
		System.out.println("\n [notifyObservers ] "+ld);
		for(Observer o:this.observers) {//ArrayList 마지막리스트 넘버의 요소데이터로 update 실행
			o.update(ld.getDateTime(), ld.getTemperature(), ld.getWindVelocity(), ld.getRelativeHumidity());
		}
	}



}
