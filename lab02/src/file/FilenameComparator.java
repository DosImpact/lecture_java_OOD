package file;

// 재너릭 Comparator인터페이스 구현 >  Comparator<FileInfo> > 파일이름 비교
public class FilenameComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (o1.getFilename().compareTo(o2.getFilename()));
	}

}


