
public class PdfDocumentConverter extends DocumentConverter {

	public PdfDocumentConverter() {
		super("pdf");
	}

	@Override
	public void save(String filename) {
		System.out.println("PdfDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
