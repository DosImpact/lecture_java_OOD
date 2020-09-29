
public class MainTest {

	public static void main(String[] args) {
		
		// doc1.docx ��� ���ϸ����� �����մϴ�.
		WordProcessor wp = new WordProcessor("doc1.docx");
		
		// ����üĿ  ���
		wp.setSpellChcker(new EnglishSpellChecker());
		// ������ ���
		wp.addDocumentConverter(new DocxDocumentConverter());
		wp.addDocumentConverter(new PdfDocumentConverter());
		wp.addDocumentConverter(new TxtDocumentConverter());
		
		// ��ϵ� ����  ����üĿ  ����
		wp.checkSpelling();
		
		wp.convertDocumentTo("txt"); 	// ������ ���� txt
		wp.convertDocumentTo("pdf");	// ������ ���� pdf
		wp.convertDocumentTo("docx");	// ������ ���� docx
		wp.convertDocumentTo("wps");	// ������ ���� wps	//cannot

	}

}
