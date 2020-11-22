
// DataList는 Iterable를 확장하여 이터레이션에 필요한 기능들을 구현한다.
public interface DataList<E> extends Iterable<E> {
	void add(E e);
	void add(int index,E e);
	void remove(int index);
	E get(int index);
	int size();
	void clear();
	void print();
}
