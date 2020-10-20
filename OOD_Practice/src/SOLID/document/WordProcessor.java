package SOLID.document;

import java.util.HashMap;;
// 스펠체크
// 컨버팅
public class WordProcessor {
	String filename;
	ISpellChecker checker;
	HashMap<String,DocumentConvertor> converts;
	
	
	public WordProcessor(String filename) {
		this.filename = filename.substring(0,filename.indexOf("."))+"." ;
		this.converts = new HashMap<String, DocumentConvertor>();
	}

	public void addConvertor(DocumentConvertor convertor) {
		converts.put(convertor.getExt(),convertor);
	}
	
	public void convertTo(String ext) {
		if(converts.containsKey(ext)) {
			converts.get(ext).converTo(this.filename);
		}
	}
	public void setSpellCheck(ISpellChecker checker) {
		this.checker = checker;
	}
	public void spellCheck() {
		this.checker.spellCheck();
	}
}
