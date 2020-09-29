package file;



public class Sorter<E> {
	private Comparator<E> comparator;
	//생성자
	public Sorter() {	}
	
	// setter
	public void setComparator(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
	// 제너릭 타입의 E 로 데이터를 정렬합니다. comparator 또한 E 타입으로 E 타입에 대한 정렬 기능을 구현한 compare가 있습니다.
	public void bubbleSort(E[] data ) {
		for(int i = 0; i < data.length -1 ; i++) {
			for(int j = 0 ; j < data.length - i - 1; j ++) {
				if( this.comparator.compare(data[j],data[j+1]) > 0 ) {
					E tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp; 
				}
			}
		}
	}
	

}
