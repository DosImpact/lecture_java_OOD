package file;

//재너릭 Comparator인터페이스 구현 >  Comparator<FileInfo> > 크기비교
public class SizeComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (int) (o1.getSize() - o2.getSize());
	}
}
