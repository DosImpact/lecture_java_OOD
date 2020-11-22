package sorter;

public abstract class AbstractSorter {
	
	
	// template method
	public final void bubbleSort(Person[] data ) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( compare(data[j],data[j+1]) > 0 ) {
					swap(data,j,j+1);
				}
			}
		}
	}
	// concrete method
	private void swap(Person[] data,int i, int j) {
		Person tmp = data[i];
		data[i] = data[j];
		data[j] = tmp; 
	}
	// primitive method
	public abstract int compare(Person p1,Person p2);
}
