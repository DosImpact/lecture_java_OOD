
public interface Subject {
	// 옵져버 추가,삭제,알림 기능 구현
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
