import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		// load data & calculate & save newdata
		List<WeatherData> data = WeatherDataImporter.loadCSV("OBS_ASOS_DD_20200924113100.csv");

		double value = HeatIndexDisplay.calculate(30, 90);
		System.out.println("value=" + value);
		System.out.println("done..");
	}

}

// TODO LIST
// 1. 스레드에서 1초마다 sleep 진행하면서, 데이터를 넣어주기
// 2. csv 로드
