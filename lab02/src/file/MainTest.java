package file;
import java.io.File;
import java.util.List;

public class MainTest {
	
	private FileInfo[] fileList;
	// 파일 info 배열 출력
	public void printFileInfos(FileInfo[] fileList) {
		
	}
	// 파일 info objet get
	public FileInfo getFileInfo(String filename) {
		return null;
	}

	//get FileInfo
	public List<FileInfo> getFileInfos(String dirPath){
		// 경로의 파일과 디렉터리를 읽습니다.
		File dir = new File(dirPath);
		File[] sub =  dir.listFiles();
		for(File s :sub) {
			// 디렉터리인 경우 해당 경로로 들어가서 파일과 디렉터리를 읽습니다.
			if(s.isDirectory()) {
				System.out.println("<DIR>\t"+s.length()+"\t\t"+s.lastModified()+"\t\t"+s.getName());
				getFileInfos(dirPath+"\\"+s.getName());
			// 파일인 경우에는 리스트에 추가합니다.
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
