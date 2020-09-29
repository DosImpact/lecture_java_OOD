package file;


public class DateComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (o1.getModifiedDate().compareTo(o2.getModifiedDate()));
	}
}
