package barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook  extends CaffeineBeverageWithHook {

	@Override
	protected boolean customCondiments() {
		String ans = getUserInput();
		if( ans.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}
	private String getUserInput() {
		String ans = null;
		System.out.println("would you like Adding Lemon ? (y/n) ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			ans = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if( ans == null) {
			return "n";
		}else {
			return "y";
		}
	}
	
	@Override
	protected void addCondiments() {
		System.out.println("Adding Lemon");
	}

	@Override
	protected void brew() {
		System.out.println("Steeping the Tea");
	}

}
