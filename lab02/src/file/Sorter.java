package file;

import java.util.Date;

public class Sorter<E> {
	private Comparator<E> comparator;
	
	public Sorter(Comparator<E> comparator) {
		this.comparator = comparator;
	}

	public void setComparator(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
	public void bubbleSort(E[] data ) {
	}
	
	private void bubbleSortInts(int[] data) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( data[j] > data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp; 
				}
			}
		}
	}
	
	private void bubbleSortStrings(String[] data) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( data[j].compareTo(data[j+1]) > 0) {
					String tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp; 
				}
			}
		}
	}
	
	
	private void bubbleSortDates(Date[] data) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( data[j].compareTo(data[j+1]) > 0) {
					Date tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp; 
				}
			}
		}
	}
}
