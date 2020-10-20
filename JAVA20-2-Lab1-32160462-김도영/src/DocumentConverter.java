
public abstract class DocumentConverter {
	private String ext;
	
	public DocumentConverter(String extension) {
		this.ext = extension;
	}
	public String getExtension() {
		return this.ext;
	}
	
	public abstract void save(String filename);
}
