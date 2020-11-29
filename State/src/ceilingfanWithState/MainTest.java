package ceilingfanWithState;

import java.util.Scanner;

public class MainTest {
	
	static Scanner input = new Scanner(System.in);

	public static boolean getUserExitKey() {
		System.out.println("Continue? (q)uit");
		String s = input.nextLine();
		if(s.contentEquals("q")) {
			return  true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Ceiling Fan Operating...");
		CeilingFanWithState ceilingFan = new CeilingFanWithState();
		while(!getUserExitKey()) {
			ceilingFan.pull();
		}
		System.out.println("end");
	}
	

}
