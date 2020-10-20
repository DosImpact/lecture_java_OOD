package SOLID.document2;

public class MainTest {

	public static void main(String[] args) {
		WordProcessor processor = new WordProcessor("sample.docx");
		processor.setChecker(new EnglishSpellChecker());
		processor.check();
		
		processor.addConvertor(new PDFConvertor());
		processor.addConvertor(new JPGConvertor());
		processor.convertTo("PDF");
		processor.convertTo("JPG");
	}

}
