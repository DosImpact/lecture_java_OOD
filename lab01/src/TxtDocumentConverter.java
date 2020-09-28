
public class TxtDocumentConverter extends DocumentConverter {

	public TxtDocumentConverter() {
		super("txt");
	}

	@Override
	public void save(String filename) {
		System.out.println("TxtDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
