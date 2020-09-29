// DocumentConverter 추상 클래스 구현 > docx 컨버터 확장
public class DocxDocumentConverter extends DocumentConverter {
	// 생성자
	public DocxDocumentConverter() {
		super("docx");
	}
	// docx 저장 기능으로 확장
	@Override
	public void save(String filename) {
		System.out.println("DocxDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
