package Stretegy.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		Person[] people = {
				new Person("A", 20),
				new Person("D", 30),
				new Person("B", 26),
				new Person("E",10)
		};
		for(Person p :people) {
			System.out.println(p);
		}
		Arrays.sort(people);
		for(Person p :people) {
			System.out.println(p);
		}
		Arrays.sort(people,new AgeComparator());
		for(Person p :people) {
			System.out.println(p);
		}
		
	}

}
