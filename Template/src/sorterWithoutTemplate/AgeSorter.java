package sorterWithoutTemplate;


public class AgeSorter {

	// template method
	public final void bubbleSort(Person[] data ) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( data[j].getAge()  > data[j+1].getAge() ) {
//				if( compare(data[j],data[j+1]) > 0 ) {
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
	
	public int compare(Person o1, Person o2) {
		return o1.getAge() - o2.getAge();
	}

}
