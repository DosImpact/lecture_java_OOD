import java.util.HashMap;


public class WordProcessor {
	private ISpellChecker spellChecker = null; // �������̽� Ÿ������ �ٷﵵ �Ǵ���?
	private HashMap<String, DocumentConverter> documentConverters = null;
	private String filename = null;
	
	//������.
	public WordProcessor(String filename) {
		super();
		this.filename = filename.substring(0,filename.indexOf("."));
		this.documentConverters = new HashMap<String, DocumentConverter>();
	}
	// ���� �����͸�  ���
	public void addDocumentConverter(DocumentConverter converter) {
		this.documentConverters.put(converter.getExtension(),converter);
	}
	// ���� �����͸�  ���� , ���࿡ ���� �̸����� ���� ��ȯ ��û��, �Ұ� �޽��� ���
	public void convertDocumentTo(String ext) {
		if(this.documentConverters.containsKey(ext)) {
			this.documentConverters.get(ext).save(this.filename);
		}else {
			System.out.println("cannot converDocumentTo "+ext+" file format");
		}
	}
	// ���� üĿ�� ����մϴ�.
	public void setSpellChcker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	// ���� üĿ�� ����.
	public void checkSpelling() {
		spellChecker.check();
	}

}
