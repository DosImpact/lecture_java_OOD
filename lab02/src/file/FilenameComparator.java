package file;


public class FilenameComparator implements Comparator<FileInfo> {

	@Override
	public int compare(FileInfo o1, FileInfo o2) {
		return (o1.getFilename().compareTo(o2.getFilename()));
	}

}


