package sorter;


public class AgeSorter extends AbstractSorter{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge() - o2.getAge();
	}

}
