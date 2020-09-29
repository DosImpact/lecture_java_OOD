package file;



public class Sorter {
	private Comparator<FileInfo> comparator;
	
	public Sorter() {	}

	public void setComparator(Comparator<FileInfo> comparator) {
		this.comparator = comparator;
	}
	
	
	public void bubbleSort(FileInfo[] data ) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( this.comparator.compare(data[j],data[j+1]) > 0 ) {
					FileInfo tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp; 
				}
			}
		}
	}
	

}
