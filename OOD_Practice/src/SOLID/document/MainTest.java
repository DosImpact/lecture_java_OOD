package SOLID.document;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Main Test");
		WordProcessor processor = new WordProcessor("sample.word");
		processor.addConvertor(new PdfConvertor());
		processor.setSpellCheck(new EnglishSpellChecker() );
		
		
		processor.spellCheck();
		processor.convertTo("PDF");
	}

}
