package file;

// Comparator 제너릭 인터페이스 입니다. 클래스에서 타입을 지정해서 구현을 해야하며, Sorter의 정렬 정책에 사용됩니다.
public interface Comparator<E> {
	public int compare(E o1,E o2);
}
