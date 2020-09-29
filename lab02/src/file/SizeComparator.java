package file;


public class SizeComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (int) (o1.getSize() - o2.getSize());
	}
}
