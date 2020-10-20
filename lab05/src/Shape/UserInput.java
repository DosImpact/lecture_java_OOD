package Shape;

import java.util.Scanner;

// scanner 클래스 static 화
public class UserInput {
	// static 변수로 스캐너를선언
	public static Scanner scanner = new Scanner(System.in);
	// double 을 입력받아서 리턴
	public static double getDouble() {
		return scanner.nextDouble();
	}
	// 특정 범위의 int를 입력받아서 리턴, 범위를 벗어나면 0을 출력 ( 애러 발생 고도화 가능 )
	public static int getIntegerBetween(int a,int b) {
		int userins = scanner.nextInt();
		if( userins >= a && userins <= b) {
			return userins;
		}else {
			return 0;
		}
	}
}
