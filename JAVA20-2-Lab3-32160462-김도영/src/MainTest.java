import java.util.ArrayList;
import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		// WeatherDataSubject Ŭ���� ���� �� ������ ����
		WeatherDataSubject wdata =  new WeatherDataSubject();
		new Thread(wdata).start();
	}
}

