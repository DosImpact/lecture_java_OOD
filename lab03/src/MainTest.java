<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		// WeatherDataSubject Ŭ���� ���� �� ������ ����
		WeatherDataSubject wdata =  new WeatherDataSubject();
		new Thread(wdata).start();
	}
}

=======
import java.util.ArrayList;
import java.util.List;


public class MainTest {

	public static void main(String[] args) {
		WeatherDataSubject wdata =  new WeatherDataSubject();
		

		
		new Thread(wdata).start();

	}

}

>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
