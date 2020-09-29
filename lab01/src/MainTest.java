
public class MainTest {

	public static void main(String[] args) {
		
		// doc1.docx 라는 파일명으로 생성합니다.
		WordProcessor wp = new WordProcessor("doc1.docx");
		
		// 스펠체커  등록
		wp.setSpellChcker(new EnglishSpellChecker());
		// 컨버터 등록
		wp.addDocumentConverter(new DocxDocumentConverter());
		wp.addDocumentConverter(new PdfDocumentConverter());
		wp.addDocumentConverter(new TxtDocumentConverter());
		
		// 등록된 영어  스펠체커  실행
		wp.checkSpelling();
		
		wp.convertDocumentTo("txt"); 	// 컨버터 실행 txt
		wp.convertDocumentTo("pdf");	// 컨버터 실행 pdf
		wp.convertDocumentTo("docx");	// 컨버터 실행 docx
		wp.convertDocumentTo("wps");	// 컨버터 실행 wps	//cannot

	}

}
