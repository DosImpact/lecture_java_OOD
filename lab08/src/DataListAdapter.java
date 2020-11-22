import java.util.Iterator;
import java.util.List;

// DataList�� �����ؼ� ����ʹ� Ŭ������ ��������� DataList�� �������̽��� �����մϴ�.
public class DataListAdapter<E> implements DataList<E> {	
	private List<E> list;						// List�� �޾Ƽ� List������ �������̽��� �����մϴ�.
	public DataListAdapter(List<E> list) {	// �����ڷ� List �Է�
		super();
		this.list = list;
	}

	@Override
	public Iterator<E> iterator() {		//DataList�� �������̽��� ����(����) iterator
		return list.iterator();
	}

	@Override
	public void add(E e) {//DataList�� �������̽��� ����(����) add
		list.add(e);
	}

	@Override
	public void add(int index, E e) {//DataList�� �������̽��� ����(����) add
		list.add(index, e);
	}

	@Override
	public void remove(int index) {//DataList�� �������̽��� ����(����) remove
		list.remove(index);
	}

	@Override
	public E get(int index) {//DataList�� �������̽��� ����(����) get
		return list.get(index);
	}

	@Override
	public int size() {//DataList�� �������̽��� ����(����) size
		return list.size();
	}

	@Override
	public void clear() {//DataList�� �������̽��� ����(����) clear
		list.clear();
	}

	@Override
	public void print() {//DataList�� �������̽��� ����(����) print
		for(E l :list) {
			System.out.println(l);
		}
	}
}
