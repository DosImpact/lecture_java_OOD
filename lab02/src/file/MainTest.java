package file;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {
	
	public ArrayList<FileInfo> fileList = new ArrayList<FileInfo>();
	
	// 파일 info 리스트를 배열로 출력
	public FileInfo[] printFileInfos() {
		FileInfo[] fi = new FileInfo[this.fileList.size()];
		fi = (FileInfo[]) this.fileList.toArray(fi);
		return fi;
	}
	
	// 파일 이름을 검색합니다.
	public FileInfo getFileInfo(String filename) {
		for(FileInfo f : fileList) {
			if(f.getFilename() == filename) {
				return f;
			}
		}
		return null;
	}

	//디렉터리를 읽어서  모든 하위 디렉터리까지 파일 정보를 리스트로 저장합니다.
	public List<FileInfo> getFileInfos(String dirPath){
		// 경로의 파일과 디렉터리를 읽습니다.
		File dir = new File(dirPath);
		File[] sub =  dir.listFiles();
		for(File s :sub) {
			
			// 디렉터리인 경우 해당 재귀호출을 통해 하위 경로로 들어가서 파일과 디렉터리를 읽습니다. 그리고 리스트에 추가합니다.
			if(s.isDirectory()) {
				System.out.println("<DIR>\t"+s.length()+"\t\t"+s.lastModified()+"\t\t"+s.getName());
				String path = dirPath+"\\"+s.getName();
				String type = "<DIR>";
				fileList.add(new FileInfo(path, type, s.length(), new Date(s.lastModified())));
				getFileInfos(dirPath+"\\"+s.getName());
			// 파일인 경우에는 리스트에 추가합니다.
			} else {
				System.out.println("<FILE>\t"+s.length()+"\t\t"+s.lastModified()+"\t\t"+s.getName());
				String path = dirPath+"\\"+s.getName();
				String type = s.getName().substring(s.getName().lastIndexOf(".")+1);
				fileList.add(new FileInfo(path,type, s.length(), new Date(s.lastModified())));
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		
		MainTest mt = new MainTest();
		
		// 로컬 D 드라이브의 해당 경로에서 , 모든 파일과 디렉터리를 읽어서 리스트에 저장합니다.
		mt.getFileInfos("D:\\Java_Lectrue\\Strategy");
		
		// 원본 리스트를 출력합니다.
		System.out.println("\n\n원본 리스트");
		FileInfo[]  fi = null ;
		fi = mt.printFileInfos();
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter 객체를 생성합니다.
		Sorter  sorter = new Sorter();
		
		
		// sorter 객체에 , filename 으로 정렬하는 정책을 셋팅합니다. 정렬 후 결과값을 출력합니다.
		System.out.println("\n\n파일 이름으로 정렬된 리스트");
		sorter.setComparator(new FilenameComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter 객체에 , type 으로 정렬하는 정책을 셋팅합니다. 정렬 후 결과값을 출력합니다.
		System.out.println("\n\n파일 종류로 정렬된 리스트");
		sorter.setComparator(new TypeComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter 객체에 , size 으로 정렬하는 정책을 셋팅합니다. 정렬 후 결과값을 출력합니다.
		System.out.println("\n\n파일 크기로 정렬된 리스트");
		sorter.setComparator(new SizeComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter 객체에 , 마지막 수정시간 으로 정렬하는 정책을 셋팅합니다. 정렬 후 결과값을 출력합니다.
		System.out.println("\n\n파일 수정 시간으로 정렬된 리스트");
		sorter.setComparator(new DateComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
	}
	

}
