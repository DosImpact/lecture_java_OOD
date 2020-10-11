
public interface Subject {
	// Subject 에서 옵져버 패턴 구현을 위한 필수 메소드들
	void addObserver(Observer o); 
	void removeObserver(Observer o);
	void notifyObserver();
}
