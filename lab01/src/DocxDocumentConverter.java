
public class DocxDocumentConverter extends DocumentConverter {

	public DocxDocumentConverter() {
		super("docx");
	}

	@Override
	public void save(String filename) {
		System.out.println("DocxDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
