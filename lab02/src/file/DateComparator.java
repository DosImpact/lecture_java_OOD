package file;

//재너릭 Comparator인터페이스 구현 >  Comparator<FileInfo> > 수정 날짜 비교
public class DateComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (o1.getModifiedDate().compareTo(o2.getModifiedDate()));
	}
}
