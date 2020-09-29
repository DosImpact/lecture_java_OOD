package file;

import java.util.Date;

public class FileInfo {
	private String filename;
	private String type;
	private long size;
	private Date modifiedDate;
	
	public FileInfo(String filename, String type, long size, Date modifiedDate) {
		super();
		this.filename = filename;
		this.type = type;
		this.size = size;
		this.modifiedDate = modifiedDate;
	}
	
	public String getFilename() {
		return filename;
	}
	public String getType() {
		return type;
	}
	public long getSize() {
		return size;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	
	@Override
	public String toString() {
		return "FileInfo [filename=" + filename + ", type=" + type + ", size=" + size + ", modifiedDate=" + modifiedDate
				+ "]";
	}

}
