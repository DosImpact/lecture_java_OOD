import java.util.Date;

public interface Observer {
	// subject에서 notify시 update함수가 실행될 예정
	void update(Date dateTime,double temp, double velocity, double humidity);
}
