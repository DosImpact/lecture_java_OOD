import java.util.ArrayList;
import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		// load data & calculate & save newdata
		List<WeatherData> data = WeatherDataImporter.loadCSV("OBS_ASOS_DD_20200924113100.csv");

		double value = HeatIndexDisplay.calculate(30, 90);
		System.out.println("value=" + value);
		System.out.println("done..");
		
		
//		ArrayList<String> testStrings = new ArrayList<String>();
//		testStrings.add("hell");
//		testStrings.add("dosimpacts");
//		System.out.println(testStrings.get(testStrings.size()-1));
		
		// print all
//		new Thread(new SampleRunnerable(),"TestThread").start();
		// 지점,지점명,일시,평균기온(°C),평균 풍속(m/s),평균 상대습도(%)
    	List<WeatherData> list = WeatherDataImporter.loadCSV("/Users/doyoung/eclipse-workspace/lecture_java_OOD/lab03/OBS_ASOS_DD_20200924113100.csv");
    	for(WeatherData l : list) {
    		System.out.println(l);
    	}
	}

}

// TODO LIST
// 1. 스레드에서 1초마다 sleep 진행하면서, 데이터를 넣어주기 
// 2. csv 로드
