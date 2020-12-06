package lab09;

public class MainTest {

	public static void main(String[] args) {
	
		// 더블 파서를 실행시킵니다.
		DoubleParser doubleParser = new DoubleParser();
		double result;	//결과 출력 임시변수
		String input;	// 입력 임시 변수
		
		
		// 문자열을 입력하여  double형태로 파싱합니다.
		// 올바른 형태입력은 결과를 출력하지만 ,애러가 나는 경우 메시지를 출력합니다.
		try {
			input = ".1234567";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "-.45";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "12abc";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "ab45";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "12.-3";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "1+2";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "143e-3";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "+123.2345";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "12..";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "12.";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "-25.78";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		try {
			input = "+25.78";
			System.out.println("DoubleParser : "+input);
			result = doubleParser.toDouble(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("잘못된 입력 형식 입니다.");
		}
		
		
	}

}
