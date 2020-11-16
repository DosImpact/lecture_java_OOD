import java.util.Iterator;


public class DynamicArray<E> implements DataList<E> ,Iterable<E> {

	private static final int CAPACITY = 3;
	private E[] data = null;
	private int size = 0 ;
	private int capacity = CAPACITY;
	
	public DynamicArray() {
		this(CAPACITY);
	}
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.data = (E [])new Object[this.capacity];
	}

	private void copy(E data, int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		
		// 데이터 복사가 일어난다.
		for(int i = 0 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		newData[newCapacity - 1] = data;
		this.data = newData;
	}
	
	private void copy(int index,E data, int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		
		// 데이터 복사가 일어난다.
		for(int i = 0 ; i < index-1; i++) {
			newData[i] = this.data[i];
		}
		newData[index] = data;
		// 데이터 복사가 일어난다.
		for(int i = index+1 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
	@Override
	public void add(E data) {
		if(this.size < this.capacity) {
			this.data[size] = data;
			size++;
		}else {
			this.size++;
			this.capacity++;
			copy(data,this.capacity);
			System.out.println("dynamically increased needed "+size);
		}
	}

	@Override
	public void add(int index, E e) {
		if(index >= this.size) {
			System.out.println("add is fail");
			return;
		}
		if(this.size >= this.capacity) {
			this.size++;
			this.capacity++;
			copy(data[index],this.capacity);
			System.out.println("dynamically increased needed "+size);
		}
		copy(index,e,this.capacity+1);
	}

	@Override
	public void remove(int index) {
		if(index < this.size) {
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
	public DynamicArray<E> getOuter() {
	    return this;
	}
	
	private class DynamicArrayIterator<E> implements Iterator<E> {
		private int cursor;
		
		public DynamicArrayIterator() {
			cursor = -1;
		}
		@Override
		public boolean hasNext() {
			return cursor < size-1;
		}
		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if(!this.hasNext()) {
				return null;
			}
			cursor += 1;
			return (E) data[cursor];
		}
		public void remove() {
//			DynamicArray.this.remo
			getOuter().remove(this.cursor);
			cursor+=1;
		}
	}


	@Override
	public Iterator<E> iterator() {
		return new DynamicArrayIterator<E>();
	}
	
}
