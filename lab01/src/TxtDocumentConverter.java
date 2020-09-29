// DocumentConverter �߻� Ŭ���� ���� > TXT ������ Ȯ��
public class TxtDocumentConverter extends DocumentConverter {

	// ������
	public TxtDocumentConverter() {
		super("txt");
	}
	// txt ���� ������� Ȯ��
	@Override
	public void save(String filename) {
		System.out.println("TxtDocumentConverter Save document converted to "+filename+"."+super.getExtension());
	}
}
