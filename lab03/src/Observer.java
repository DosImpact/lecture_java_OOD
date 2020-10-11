import java.util.Date;

public interface Observer {
	// subject에서 데이터 변경시 Observer의 update함수를 호출 할 예정
	void update(Date dateTime,double temp, double velocity, double humidity);
}
