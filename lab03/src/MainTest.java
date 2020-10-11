import java.util.ArrayList;
import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		// WeatherDataSubject 클래스 생성 및 스래드 실행
		WeatherDataSubject wdata =  new WeatherDataSubject();
		new Thread(wdata).start();
	}
}

