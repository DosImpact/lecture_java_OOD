import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("soul");
		cities.add("here");
		cities.add("there");
		Iterator<String> it = cities.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
//			it.remove();
		}
		
		for(Iterator<String> its = cities.iterator(); its.hasNext(); ) {
			String s = its.next();
			System.out.println(s);
		}
		
		for(String city:cities) {
			System.out.println(city);
		}
	}

}
