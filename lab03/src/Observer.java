import java.util.Date;

public interface Observer {
	// subject���� ������ ����� Observer�� update�Լ��� ȣ�� �� ����
	void update(Date dateTime,double temp, double velocity, double humidity);
}
