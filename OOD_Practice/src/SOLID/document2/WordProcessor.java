package SOLID.document2;

import java.util.HashMap;

public class WordProcessor {
	// filename
	String filename;
	ISpellChecker checker;
	HashMap<String,DocumentConvertor> convertors;
	
	public WordProcessor(String filename) {
		this.filename = filename.substring(0,filename.indexOf("."))+".";
		this.convertors = new HashMap<String, DocumentConvertor>();
	}

	public void setChecker(ISpellChecker checker) {
		this.checker = checker;
	}
	public void check() {
		this.checker.spellCheck();
	}
	public void addConvertor(DocumentConvertor convertor) {
		convertors.put(convertor.getExt(), convertor);
	}
	public void convertTo(String ext) {
		if(convertors.containsKey(ext)) {
			convertors.get(ext).convertTo(filename);
		}
	}
	
	
}
