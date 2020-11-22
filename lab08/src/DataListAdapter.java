import java.util.Iterator;
import java.util.List;

// DataList를 구현해서 어댑터는 클래스는 결과적으로 DataList의 인터페이스를 제공합니다.
public class DataListAdapter<E> implements DataList<E> {	
	private List<E> list;						// List를 받아서 List에대한 인터페이스를 매핑합니다.
	public DataListAdapter(List<E> list) {	// 생성자로 List 입력
		super();
		this.list = list;
	}

	@Override
	public Iterator<E> iterator() {		//DataList의 인터페이스를 구현(매핑) iterator
		return list.iterator();
	}

	@Override
	public void add(E e) {//DataList의 인터페이스를 구현(매핑) add
		list.add(e);
	}

	@Override
	public void add(int index, E e) {//DataList의 인터페이스를 구현(매핑) add
		list.add(index, e);
	}

	@Override
	public void remove(int index) {//DataList의 인터페이스를 구현(매핑) remove
		list.remove(index);
	}

	@Override
	public E get(int index) {//DataList의 인터페이스를 구현(매핑) get
		return list.get(index);
	}

	@Override
	public int size() {//DataList의 인터페이스를 구현(매핑) size
		return list.size();
	}

	@Override
	public void clear() {//DataList의 인터페이스를 구현(매핑) clear
		list.clear();
	}

	@Override
	public void print() {//DataList의 인터페이스를 구현(매핑) print
		for(E l :list) {
			System.out.println(l);
		}
	}
}
