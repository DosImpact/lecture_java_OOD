import java.util.Iterator;

// DataList�� ���� �����迭�� �����Ѵ�.
public class DynamicArray<E> implements DataList<E>  {

	private static final int CAPACITY = 3;
	private E[] data = null;
	private int size = 0 ;
	private int capacity = CAPACITY;

	// �����迭 ������, �⺻ ũ�� �� �ʱ� ũ�⸦ ������ �� �ִ�.
	public DynamicArray() {
		this(CAPACITY);
	}
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.data = (E [])new Object[this.capacity];
	}

	// copy �뷮�� �ø��� �ø� �迭�� �����͸� �ִ´�.
	private void copy(E data, int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		
		// ������ ���簡 �Ͼ��.
		for(int i = 0 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		newData[newCapacity - 1] = data;
		this.data = newData;
	}
	// copy �뷮�� �ø��� �ø� �迭�� �����͸� �ִ´�. + Ư�� �ε����� �����͸� �ִ´�.
	private void copy(int index,E data, int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		
		// index���� ������ ���簡 �Ͼ��.
		for(int i = 0 ; i < index-1; i++) {
			newData[i] = this.data[i];
		}
		newData[index] = data;
		// index���� ������ ���簡 �Ͼ��.
		for(int i = index+1 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
	@Override
	public void add(E data) {
		if(this.size < this.capacity) { // �뷮�� ����� ���, size������ ������ ����
			this.data[size] = data;
			size++;
		}else {							// �뷮�� �����Ѱ�� copy�� ���� ������ Ȯ��
			this.size++;
			this.capacity++;
			copy(data,this.capacity);
			System.out.println("dynamically increased needed "+size);
		}
	}

	@Override
	public void add(int index, E e) {
		if(index >= this.size) {				//�߸��� index�� ����
			System.out.println("add is fail");
			return;
		}
		if(this.size >= this.capacity) {		// �뷮�� �����Ѱ�� copy�� ���� ������ Ȯ��
			this.size++;
			this.capacity++;
			copy(index,e,this.capacity+1);
			System.out.println("dynamically increased needed "+size);
			return;
		}
		this.size++;							// �뷮�� ����� ���, size������ ������ ����
		for(int i = index ; i < size-1; i++) {	// index���� ��ĭ�������͸� �̷�
			this.data[i+1] = this.data[i];		
		}
		this.data[index] = e;					// index�κп� ������ ����
	}

	@Override
	public void remove(int index) {
		if(index < this.size) {					// index�� size�����϶� ������ ����, �� ����
			for(int i = index ; i < this.size-2; i++) {
				this.data[i] = this.data[i+1];
			}
			this.size -=1;
		}
	}

	@Override
	public E get(int index) {
		return data[index];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void clear() {
		this.capacity = DynamicArray.CAPACITY;
		this.data = (E [])new Object[this.capacity];
	}

	@Override
	public void print() {
		for(E d:data) {
			System.out.println(d);
		}
	}
	// innerclass���� outter Ŭ������ ��� ���� ���
	public DynamicArray<E> getOuter() {
	    return this;
	}
	// iterator�� ��ȯ cursor�� ���� iterator�� �����Ѵ�.
	private class DynamicArrayIterator<E> implements Iterator<E> {
		private int cursor;
		
		public DynamicArrayIterator() { // �ʱⰪ�� -1
			cursor = -1;
		}
		@Override
		public boolean hasNext() {		// �������δ� cursor�� sizeũ���
			return cursor < size-1;
		}
		@SuppressWarnings("unchecked")
		@Override
		public E next() {				// next�� ������ �������� ��ȯ�Ѵ�.
			if(!this.hasNext()) {
				return null;
			}
			cursor += 1;
			return (E) data[cursor];
		}
		public void remove() {			// ���Ŵ� outterŬ������ �̿� �� cursor����
//			DynamicArray.this.remo
			getOuter().remove(this.cursor);
			cursor+=1;
		}
	}


	@Override
	public Iterator<E> iterator() {		// iterator ��ȯ
		return new DynamicArrayIterator<E>();
	}
	
}
