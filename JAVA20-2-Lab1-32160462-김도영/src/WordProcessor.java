import java.util.HashMap;


public class WordProcessor {
	private ISpellChecker spellChecker = null; // 인터페이스 타입으로 다뤄도 되는지?
	private HashMap<String, DocumentConverter> documentConverters = null;
	private String filename = null;
	
	//생성자.
	public WordProcessor(String filename) {
		super();
		this.filename = filename.substring(0,filename.indexOf("."));
		this.documentConverters = new HashMap<String, DocumentConverter>();
	}
	// 문서 컨버터를  등록
	public void addDocumentConverter(DocumentConverter converter) {
		this.documentConverters.put(converter.getExtension(),converter);
	}
	// 문서 컨버터를  실행 , 만약에 없는 이름으로 문서 변환 요청시, 불가 메시지 출력
	public void convertDocumentTo(String ext) {
		if(this.documentConverters.containsKey(ext)) {
			this.documentConverters.get(ext).save(this.filename);
		}else {
			System.out.println("cannot converDocumentTo "+ext+" file format");
		}
	}
	// 스펠 체커를 등록합니다.
	public void setSpellChcker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	// 스펠 체커를 실행.
	public void checkSpelling() {
		spellChecker.check();
	}

}
