package lab09;

public class MainTest {

	public static void main(String[] args) {
	
		
		DoubleParser doubleParser = new DoubleParser();
		double result;
		String input;
		
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
