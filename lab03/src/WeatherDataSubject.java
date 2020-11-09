import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class WeatherDataSubject implements Subject,Runnable {

	private ArrayList<WeatherData> data = null;
	private ArrayList<Observer> observers = null;
	private List<WeatherData> list = null;
	
<<<<<<< HEAD
	// 생성자 - 들어온 data 와 seed를 줄 데이터를 loadCSV를 통해 list에 저장합니다.
=======
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
	public WeatherDataSubject() {
		super();
		this.data = new ArrayList<WeatherData>();
		this.observers =  new ArrayList<Observer>();
<<<<<<< HEAD
		this.list = WeatherDataImporter.loadCSV("D:\\Java_Lectrue\\lab03\\OBS_ASOS_DD_20200924113100.csv");
    	
//    	for(WeatherData l : list) {
//    		System.out.println(l); // 
=======
		this.list = WeatherDataImporter.loadCSV("/Users/doyoung/eclipse-workspace/lecture_java_OOD/lab03/OBS_ASOS_DD_20200924113100.csv");
    	
//    	for(WeatherData l : list) {
//    		System.out.println(l); // 일시,평균기온(°C),평균 풍속(m/s),평균 상대습도(%)
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
//    	}
	}
	
	private void appendWeatherData(int i) {
		data.add(this.list.get(i));
	}


	@Override
<<<<<<< HEAD
	public void run() {							//스레드에서 돌아가는 로직
		for(int i = 0 ; i < list.size() ; i++) {
			try {
				Thread.sleep(1000);				// 1 sec sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 2,4,6,8 번째에 옵져버들을 추가하여 들어온 데이터에 대한 subscribe를 합니다.
=======
	public void run() {
		for(int i = 0 ; i < list.size() ; i++) {
			try {
				Thread.sleep(10);				// 1 sec sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
			if( i == 2) this.addObserver(new CurrentConditionsDisplay());
			if( i == 4)	this.addObserver(new HeatIndexDisplay());
			if( i == 6)	this.addObserver(new WindChillTemperatureIndexDisplay());
			if( i == 8)	this.addObserver(new DecompositionIndexDisplay());
<<<<<<< HEAD
			
			this.appendWeatherData(i);		// add Random DATA
			this.notifyObserver(); 			// 옵져버 update함수 실행
			
			// 2,4,6,8 번째에 옵져버들을 추가하여 들어온 데이터에 대한 subscribe를 합니다.
=======
			this.appendWeatherData(i);		// add Random DATA
			this.notifyObserver();
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
			if( i == list.size() - 2) 	this.removeObserver(new CurrentConditionsDisplay());
			if( i == list.size() - 4)	this.removeObserver(new HeatIndexDisplay());
			if( i == list.size() - 6)	this.removeObserver(new WindChillTemperatureIndexDisplay());
			if( i == list.size() - 8)	this.removeObserver(new DecompositionIndexDisplay());
		}
	}

	@Override
<<<<<<< HEAD
	public void addObserver(Observer o) { 		//옵져버 추가
=======
	public void addObserver(Observer o) {
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
		this.observers.add(o);
	}

	@Override
<<<<<<< HEAD
	public void removeObserver(Observer o) {	//옵져버 삭제 - equals 구현
=======
	public void removeObserver(Observer o) {
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
		int i = this.observers.indexOf(o);
//		System.out.println("removeObserver : "+i);
		if(i >= 0) this.observers.remove(i);
	}

	@Override
<<<<<<< HEAD
	public void notifyObserver() {				//옵져버 알림 - 옵져버를 순회하면서 update 실행
		WeatherData ld = data.get(data.size() - 1); //ArrayList 에서 lastest 데이터로 옵져버한테 update 알림
		System.out.println("\n [notifyObservers ] "+ld);
		for(Observer o:this.observers) {
=======
	public void notifyObserver() {				//날씨정보를 업데이트하고, 리스트의 마지막에 들어온 정보로 notify
		WeatherData ld = data.get(data.size() - 1);
		System.out.println("\n [notifyObservers ] "+ld);
		for(Observer o:this.observers) {//ArrayList 마지막리스트 넘버의 요소데이터로 update 실행
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
			o.update(ld.getDateTime(), ld.getTemperature(), ld.getWindVelocity(), ld.getRelativeHumidity());
		}
	}



}
