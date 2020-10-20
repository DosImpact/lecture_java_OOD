import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class WeatherDataSubject implements Subject,Runnable {

	private ArrayList<WeatherData> data = null;
	private ArrayList<Observer> observers = null;
	private List<WeatherData> list = null;
	
	// 생성자 - 들어온 data 와 seed를 줄 데이터를 loadCSV를 통해 list에 저장합니다.
	public WeatherDataSubject() {
		super();
		this.data = new ArrayList<WeatherData>();
		this.observers =  new ArrayList<Observer>();
		this.list = WeatherDataImporter.loadCSV("D:\\Java_Lectrue\\lab03\\OBS_ASOS_DD_20200924113100.csv");
    	
//    	for(WeatherData l : list) {
//    		System.out.println(l); // 
//    	}
	}
	
	private void appendWeatherData(int i) {
		data.add(this.list.get(i));
	}


	@Override
	public void run() {							//스레드에서 돌아가는 로직
		for(int i = 0 ; i < list.size() ; i++) {
			try {
				Thread.sleep(1000);				// 1 sec sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 2,4,6,8 번째에 옵져버들을 추가하여 들어온 데이터에 대한 subscribe를 합니다.
			if( i == 2) this.addObserver(new CurrentConditionsDisplay());
			if( i == 4)	this.addObserver(new HeatIndexDisplay());
			if( i == 6)	this.addObserver(new WindChillTemperatureIndexDisplay());
			if( i == 8)	this.addObserver(new DecompositionIndexDisplay());
			
			this.appendWeatherData(i);		// add Random DATA
			this.notifyObserver(); 			// 옵져버 update함수 실행
			
			// 2,4,6,8 번째에 옵져버들을 추가하여 들어온 데이터에 대한 subscribe를 합니다.
			if( i == list.size() - 2) 	this.removeObserver(new CurrentConditionsDisplay());
			if( i == list.size() - 4)	this.removeObserver(new HeatIndexDisplay());
			if( i == list.size() - 6)	this.removeObserver(new WindChillTemperatureIndexDisplay());
			if( i == list.size() - 8)	this.removeObserver(new DecompositionIndexDisplay());
		}
	}

	@Override
	public void addObserver(Observer o) { 		//옵져버 추가
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {	//옵져버 삭제 - equals 구현
		int i = this.observers.indexOf(o);
//		System.out.println("removeObserver : "+i);
		if(i >= 0) this.observers.remove(i);
	}

	@Override
	public void notifyObserver() {				//옵져버 알림 - 옵져버를 순회하면서 update 실행
		WeatherData ld = data.get(data.size() - 1); //ArrayList 에서 lastest 데이터로 옵져버한테 update 알림
		System.out.println("\n [notifyObservers ] "+ld);
		for(Observer o:this.observers) {
			o.update(ld.getDateTime(), ld.getTemperature(), ld.getWindVelocity(), ld.getRelativeHumidity());
		}
	}



}
