package file;



public class Sorter<E> {
	private Comparator<E> comparator;
	//������
	public Sorter() {	}
	
	// setter
	public void setComparator(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	
	// ���ʸ� Ÿ���� E �� �����͸� �����մϴ�. comparator ���� E Ÿ������ E Ÿ�Կ� ���� ���� ����� ������ compare�� �ֽ��ϴ�.
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
