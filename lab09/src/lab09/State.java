package lab09;

public interface State {
	// 4���� State�� ��ȭ ���´�. 
	void plus();	// ��ȣ�� �����ϴ� �׼�
	void minus();	// ��ȣ�� �����ϴ� �׼�
	void dot(); 	// ������ �Ѿ�� �׼�
	void digit();	// ���ڸ� �߰��ϴ� �׼�
	void other();	// �ַ��� �׼�
}
