
public class MainTest {

	public static void main(String[] args) {
		
		WordProcessor wp = new WordProcessor("doc1.docx");
		wp.setSpellChcker(new EnglishSpellChecker());
		wp.addDocumentConverter(new DocxDocumentConverter());
		wp.addDocumentConverter(new PdfDocumentConverter());
		wp.addDocumentConverter(new TxtDocumentConverter());
		wp.checkSpelling();
		wp.convertDocumentTo("txt");
		wp.convertDocumentTo("pdf");
		wp.convertDocumentTo("docx");
		wp.convertDocumentTo("wps");

	}

}
