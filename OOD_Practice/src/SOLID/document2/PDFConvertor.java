package SOLID.document2;

public class PDFConvertor extends DocumentConvertor{

	public PDFConvertor() {
		super("PDF");
	}

	@Override
	public void convertTo(String filename) {
		System.out.println(filename + this.getExt());
	}

}
