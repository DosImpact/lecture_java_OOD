package sorter;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		Person[] poeple = {
				new Person(3000,"dooly"),
				new Person(30,"fwafooly"),
				new Person(2000,"asfooly"),
				new Person(20000,"doqfw"),
				new Person(30,"qooly"),
		};
		System.out.println("original people");
		for(Person p: poeple) {
			System.out.println(p);
		}
		System.out.println("sort by NameSorter");
		AbstractSorter sorter = new NameSorter();
		sorter.bubbleSort(poeple);
		for(Person p : poeple) {
			System.out.println(p);
		}
		
		System.out.println("sort by AgeSorter");
		sorter = new AgeSorter();
		sorter.bubbleSort(poeple);
		for(Person p : poeple) {
			System.out.println(p);
		}
		
//		
//		
//		Arrays.sort(poeple,null);
//		for(Person p:poeple) {
//			System.out.println(p);
//		}	
//		System.out.println("sort by Name");
//		Arrays.sort(poeple,new NameSorter());
//		for(Person p:poeple) {
//			System.out.println(p);
//		}
	}

}
