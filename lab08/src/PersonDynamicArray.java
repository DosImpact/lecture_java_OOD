import java.util.Iterator;

public class PersonDynamicArray implements Iterable<Person> {
	
	private static final int CAPACITY = 3;
	private Person[] data = null;
	private int size = 0 ;
	private int capacity = CAPACITY;
	
	public PersonDynamicArray() {
		this(CAPACITY);
	}
	
	public PersonDynamicArray(int capacity) {
		this.capacity = capacity;
		this.data = new Person[this.capacity];
	}
	
	public void add(Person data) {
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
	
	private void copy(Person data, int newCapacity) {
		Person[] newData = new Person[newCapacity];
		
		// 데이터 복사가 일어난다.
		for(int i = 0 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		newData[newCapacity - 1] = data;
		this.data = newData;
	}

	private class PersonDynamicArrayIterator implements Iterator<Person> {
		private int cursor;
		
		public PersonDynamicArrayIterator() {
			cursor = -1;
		}
		@Override
		public boolean hasNext() {
			return cursor < size-1;
		}
		@Override
		public Person next() {
			if(!this.hasNext()) {
				return null;
			}
			cursor += 1;
			return data[cursor];
		}
		public void remove() {
			cursor+=1;
		}
	}

	@Override
	public Iterator<Person> iterator() {
		return new PersonDynamicArrayIterator();
	}

}
