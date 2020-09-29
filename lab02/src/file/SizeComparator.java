package file;

public class SizeComparator implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		return (int) (o1- o2);
	}

}
