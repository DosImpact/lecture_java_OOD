
package file;

//재너릭 Comparator인터페이스 구현 >  Comparator<FileInfo> > 타입 비교
public class TypeComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (o1.getType().compareTo(o2.getType()));
	}
}
