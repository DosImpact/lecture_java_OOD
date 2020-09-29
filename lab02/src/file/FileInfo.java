package file;

import java.util.Date;


public class FileInfo  implements Comparable<FileInfo>{
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
		return "FileInfo [ type=" + type + ",\t size=" + size + ",\t modifiedDate=" + modifiedDate
+ ",\t filename=" +  filename + "]" ;
	}
	@Override
	public int compareTo(FileInfo o) {
		// TODO Auto-generated method stub
		return this.getFilename().compareTo(o.getFilename()); 
	}

}
