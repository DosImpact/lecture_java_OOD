
public interface DataList<E> extends Iterable<E> {
	void add(E e);
	void add(int index,E e);
	void remove(int index);
	E get(int index);
	int size();
	void clear();
	void print();
}
