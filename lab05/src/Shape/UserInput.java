package Shape;

import java.util.Scanner;

// scanner Ŭ���� static ȭ
public class UserInput {
	// static ������ ��ĳ�ʸ�����
	public static Scanner scanner = new Scanner(System.in);
	// double �� �Է¹޾Ƽ� ����
	public static double getDouble() {
		return scanner.nextDouble();
	}
	// Ư�� ������ int�� �Է¹޾Ƽ� ����, ������ ����� 0�� ��� ( �ַ� �߻� ��ȭ ���� )
	public static int getIntegerBetween(int a,int b) {
		int userins = scanner.nextInt();
		if( userins >= a && userins <= b) {
			return userins;
		}else {
			return 0;
		}
	}
}
