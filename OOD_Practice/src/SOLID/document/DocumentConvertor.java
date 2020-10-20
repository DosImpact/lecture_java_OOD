package SOLID.document;

public abstract class DocumentConvertor {
	String ext;

	public DocumentConvertor(String ext) {
		this.ext = ext;
	}
	public String getExt() {
		return this.ext;
	}
	public abstract void converTo(String filename) ;
	
}
