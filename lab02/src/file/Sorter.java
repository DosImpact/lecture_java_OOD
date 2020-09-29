package file;



public class Sorter {
	private Comparator<FileInfo> comparator;
	
	public Sorter() {	}

	public void setComparator(Comparator<FileInfo> comparator) {
		this.comparator = comparator;
	}
	
//	public <E> void Sort(E data) {
//		Arrays.<E>sort(data,null);
//	}
//	

	
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
	
//	public <E> void bubbleSort(E[] data ) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if( this.comparator.compare(data[j],data[j+1]) > 0 ) {
//					E tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}






	
//	
//	public <E extends String > void bubbleSort(E[] data ) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if(  ) {
//					E tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}
//	
//	public <E extends Date > void bubbleSort(E[] data ) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if( data[j].compareTo(data[j+1]) > 0) {
//					E tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}
//	public <E extends Integer> void bubbleSort(E[] data ) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if( data[j] > data[j + 1]) {
//					E tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}
//	
//	private void bubbleSortInts(int[] data) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if( data[j] > data[j + 1]) {
//					int tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}
//	
//	private void bubbleSortStrings(String[] data) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if( data[j].compareTo(data[j+1]) > 0) {
//					String tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}
//	
//	
//	private void bubbleSortDates(Date[] data) {
//		for(int i = 0; i < data.length -1 ; i++) {
//			for(int j = 0 ; j < data.length - i - 1; j ++) {
//				if( data[j].compareTo(data[j+1]) > 0) {
//					Date tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp; 
//				}
//			}
//		}
//	}
}
