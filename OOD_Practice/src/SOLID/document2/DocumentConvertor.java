package SOLID.document2;

public abstract class DocumentConvertor {
	String ext;
	public DocumentConvertor(String ext) {
		this.ext = ext;
	}
	public String getExt() {
		return this.ext;
	}
	public abstract void convertTo(String filename);
}
