import java.util.Iterator;

// DataList를 통해 동적배열을 구현한다.
public class DynamicArray<E> implements DataList<E>  {

	private static final int CAPACITY = 3;
	private E[] data = null;
	private int size = 0 ;
	private int capacity = CAPACITY;

	// 동적배열 생성자, 기본 크기 및 초기 크기를 지정할 수 있다.
	public DynamicArray() {
		this(CAPACITY);
	}
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.data = (E [])new Object[this.capacity];
	}

	// copy 용량을 늘리고 늘린 배열에 데이터를 넣는다.
	private void copy(E data, int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		
		// 데이터 복사가 일어난다.
		for(int i = 0 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		newData[newCapacity - 1] = data;
		this.data = newData;
	}
	// copy 용량을 늘리고 늘린 배열에 데이터를 넣는다. + 특정 인덱스에 데이터를 넣는다.
	private void copy(int index,E data, int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		
		// index전의 데이터 복사가 일어난다.
		for(int i = 0 ; i < index-1; i++) {
			newData[i] = this.data[i];
		}
		newData[index] = data;
		// index후의 데이터 복사가 일어난다.
		for(int i = index+1 ; i < newCapacity-1; i++) {
			newData[i] = this.data[i];
		}
		this.data = newData;
	}
	@Override
	public void add(E data) {
		if(this.size < this.capacity) { // 용량이 충분한 경우, size증가후 데이터 삽입
			this.data[size] = data;
			size++;
		}else {							// 용량이 부족한경우 copy를 통해 데이터 확장
			this.size++;
			this.capacity++;
			copy(data,this.capacity);
			System.out.println("dynamically increased needed "+size);
		}
	}

	@Override
	public void add(int index, E e) {
		if(index >= this.size) {				//잘못된 index에 삽입
			System.out.println("add is fail");
			return;
		}
		if(this.size >= this.capacity) {		// 용량이 부족한경우 copy를 통해 데이터 확장
			this.size++;
			this.capacity++;
			copy(index,e,this.capacity+1);
			System.out.println("dynamically increased needed "+size);
			return;
		}
		this.size++;							// 용량이 충분한 경우, size증가후 데이터 삽입
		for(int i = index ; i < size-1; i++) {	// index부터 한칸씩데이터를 미룸
			this.data[i+1] = this.data[i];		
		}
		this.data[index] = e;					// index부분에 데이터 삽입
	}

	@Override
	public void remove(int index) {
		if(index < this.size) {					// index가 size내부일때 데이터 삭제, 후 당기기
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
	// innerclass에서 outter 클래스를 얻기 위한 방법
	public DynamicArray<E> getOuter() {
	    return this;
	}
	// iterator를 반환 cursor를 통해 iterator를 조정한다.
	private class DynamicArrayIterator<E> implements Iterator<E> {
		private int cursor;
		
		public DynamicArrayIterator() { // 초기값은 -1
			cursor = -1;
		}
		@Override
		public boolean hasNext() {		// 다음여부는 cursor와 size크기비교
			return cursor < size-1;
		}
		@SuppressWarnings("unchecked")
		@Override
		public E next() {				// next는 다음이 있을때만 반환한다.
			if(!this.hasNext()) {
				return null;
			}
			cursor += 1;
			return (E) data[cursor];
		}
		public void remove() {			// 제거는 outter클래스를 이용 및 cursor조정
//			DynamicArray.this.remo
			getOuter().remove(this.cursor);
			cursor+=1;
		}
	}


	@Override
	public Iterator<E> iterator() {		// iterator 반환
		return new DynamicArrayIterator<E>();
	}
	
}
