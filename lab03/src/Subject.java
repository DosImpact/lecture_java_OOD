
public interface Subject {
<<<<<<< HEAD
	// Subject ���� ������ ���� ������ ���� �ʼ� �޼ҵ��
	void addObserver(Observer o); 
=======
	// 옵져버 추가,삭제,알림 기능 구현
	void addObserver(Observer o);
>>>>>>> 789faa920333a2f38521e18a1190b9fd0d246435
	void removeObserver(Observer o);
	void notifyObserver();
}
