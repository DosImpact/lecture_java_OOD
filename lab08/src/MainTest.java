import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Dynamic Array add & print String");
		
		DynamicArray<String> dynamicArray2 = new DynamicArray<>(5);
		dynamicArray2.add("hello1");
		dynamicArray2.add("hello2");
		dynamicArray2.add("hello3");

		Iterator<String> it2 = dynamicArray2.iterator();
		while(it2.hasNext()) {
			String st = it2.next();
			System.out.println(st);
			it2.remove();
		}
		
		for(String s : dynamicArray2) {
			System.out.println(s);
		}
		
		System.out.println("Dynamic Array add & print Person");
		
		DynamicArray<Person> dynamicArray = new DynamicArray<Person>(5);
		dynamicArray.add(new Person("user01", 10));
		dynamicArray.add(new Person("user02", 20));
		dynamicArray.add(new Person("user03", 30));
		
		Iterator<Person> it = dynamicArray.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
		
		System.out.println("DataListAdapter  add & print String");
		
		DataList<String> dataList3 = new DataListAdapter<>(new ArrayList<>());
		dataList3.add("Adapter 01");
		dataList3.add("Adapter 02");
		dataList3.add("Adapter 03");
		dataList3.add("Adapter 04");
		
		Iterator<String> it3 = dataList3.iterator();
		while(it3.hasNext()) {
			String p = it3.next();
			System.out.println(p);
		}
		
		
		System.out.println("DataListAdapter  add & print Person");
		
		DataList<Person> dataList4 = new DataListAdapter<>(new ArrayList<>());
		dataList4.add(new Person("AD User01", 10));
		dataList4.add(new Person("AD User02", 20));
		dataList4.add(new Person("AD User03", 30));
		dataList4.add(new Person("AD User04", 40));
		
		Iterator<Person> it4 = dataList4.iterator();
		while(it4.hasNext()) {
			Person p = it4.next();
			System.out.println(p);
		}
		System.out.println("DataListAdapter  add & print Person remove User02");
		dataList4.remove(1);
		for(Person s : dataList4) {
			System.out.println(s);
		}
		
		
	}

}
