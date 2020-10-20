package SOLID.document;

public class PdfConvertor extends DocumentConvertor {
	
	public PdfConvertor() {
		super("PDF");
	}

	@Override
	public void converTo(String filename) {
		System.out.println("converting .. to "+filename+this.getExt());
	}
	
}
