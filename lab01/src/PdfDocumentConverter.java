// DocumentConverter 추상 클래스 구현 > PDF 컨버터 확장
public class PdfDocumentConverter extends DocumentConverter {
	// 생성자
	public PdfDocumentConverter() {
		super("pdf");
	}
	// PDF 저장 기능으로 확장
	@Override
	public void save(String filename) {
		System.out.println("PdfDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
