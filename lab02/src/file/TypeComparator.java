
package file;


public class TypeComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (o1.getType().compareTo(o2.getType()));
	}
}
