
public interface Subject {
	// Subject ���� ������ ���� ������ ���� �ʼ� �޼ҵ��
	void addObserver(Observer o); 
	void removeObserver(Observer o);
	void notifyObserver();
}
