package file;
import java.io.File;
import java.util.List;

public class MainTest {
	
	private FileInfo[] fileList;
	// ���� info �迭 ���
	public void printFileInfos(FileInfo[] fileList) {
		
	}
	// ���� info objet get
	public FileInfo getFileInfo(String filename) {
		return null;
	}

	//get FileInfo
	public List<FileInfo> getFileInfos(String dirPath){
		// ����� ���ϰ� ���͸��� �н��ϴ�.
		File dir = new File(dirPath);
		File[] sub =  dir.listFiles();
		for(File s :sub) {
			// ���͸��� ��� �ش� ��η� ���� ���ϰ� ���͸��� �н��ϴ�.
			if(s.isDirectory()) {
				System.out.println("<DIR>\t"+s.length()+"\t\t"+s.lastModified()+"\t\t"+s.getName());
				getFileInfos(dirPath+"\\"+s.getName());
			// ������ ��쿡�� ����Ʈ�� �߰��մϴ�.
			}else {
				System.out.println("<FILE>\t"+s.length()+"\t\t"+s.lastModified()+"\t\t"+s.getName());				
			}
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		MainTest mt = new MainTest();
		
		mt.getFileInfos("D:\\Java_Lectrue\\Strategy\\bin");
	}
	

}
