// DocumentConverter 추상 클래스 구현 > TXT 컨버터 확장
public class TxtDocumentConverter extends DocumentConverter {

	// 생성자
	public TxtDocumentConverter() {
		super("txt");
	}
	// txt 저장 기능으로 확장
	@Override
	public void save(String filename) {
		System.out.println("TxtDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
