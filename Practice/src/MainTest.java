import java.util.Scanner;

// State ∆–≈œ
public class MainTest {
	
	public static Scanner input = new Scanner(System.in);
	
	public static boolean UserQuickInput() {
		String s = input.nextLine();
		if(s.contentEquals("q")) {
			return true;
		}else {return false;}
	}

	public static void main(String[] args) {
		FanwithState fan = new FanwithState();
		while( true ) {
			System.out.println("keep or quit");
			if(UserQuickInput()) {
				break;
			}
			fan.pull();
		}
	}

}
