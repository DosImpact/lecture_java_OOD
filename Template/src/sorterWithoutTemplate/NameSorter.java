package sorterWithoutTemplate;

public class NameSorter  extends AbstractSorter {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
