package file;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {
	
	public ArrayList<FileInfo> fileList = new ArrayList<FileInfo>();
	
	// ���� info ����Ʈ�� �迭�� ���
	public FileInfo[] printFileInfos() {
		FileInfo[] fi = new FileInfo[this.fileList.size()];
		fi = (FileInfo[]) this.fileList.toArray(fi);
		return fi;
	}
	
	// ���� �̸��� �˻��մϴ�.
	public FileInfo getFileInfo(String filename) {
		for(FileInfo f : fileList) {
			if(f.getFilename() == filename) {
				return f;
			}
		}
		return null;
	}

	//���͸��� �о  ��� ���� ���͸����� ���� ������ ����Ʈ�� �����մϴ�.
	public List<FileInfo> getFileInfos(String dirPath){
		// ����� ���ϰ� ���͸��� �н��ϴ�.
		File dir = new File(dirPath);
		File[] sub =  dir.listFiles();
		for(File s :sub) {
			
			// ���͸��� ��� �ش� ���ȣ���� ���� ���� ��η� ���� ���ϰ� ���͸��� �н��ϴ�. �׸��� ����Ʈ�� �߰��մϴ�.
			if(s.isDirectory()) {
				System.out.println("<DIR>\t"+s.length()+"\t\t"+s.lastModified()+"\t\t"+s.getName());
				String path = dirPath+"\\"+s.getName();
				String type = "<DIR>";
				fileList.add(new FileInfo(path, type, s.length(), new Date(s.lastModified())));
				getFileInfos(dirPath+"\\"+s.getName());
			// ������ ��쿡�� ����Ʈ�� �߰��մϴ�.
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
		
		// ���� D ����̺��� �ش� ��ο��� , ��� ���ϰ� ���͸��� �о ����Ʈ�� �����մϴ�.
		mt.getFileInfos("D:\\Java_Lectrue\\Strategy");
		
		// ���� ����Ʈ�� ����մϴ�.
		System.out.println("\n\n���� ����Ʈ");
		FileInfo[]  fi = null ;
		fi = mt.printFileInfos();
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter ��ü�� �����մϴ�.
		Sorter  sorter = new Sorter();
		
		
		// sorter ��ü�� , filename ���� �����ϴ� ��å�� �����մϴ�. ���� �� ������� ����մϴ�.
		System.out.println("\n\n���� �̸����� ���ĵ� ����Ʈ");
		sorter.setComparator(new FilenameComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter ��ü�� , type ���� �����ϴ� ��å�� �����մϴ�. ���� �� ������� ����մϴ�.
		System.out.println("\n\n���� ������ ���ĵ� ����Ʈ");
		sorter.setComparator(new TypeComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter ��ü�� , size ���� �����ϴ� ��å�� �����մϴ�. ���� �� ������� ����մϴ�.
		System.out.println("\n\n���� ũ��� ���ĵ� ����Ʈ");
		sorter.setComparator(new SizeComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
		// sorter ��ü�� , ������ �����ð� ���� �����ϴ� ��å�� �����մϴ�. ���� �� ������� ����մϴ�.
		System.out.println("\n\n���� ���� �ð����� ���ĵ� ����Ʈ");
		sorter.setComparator(new DateComparator());
		
		fi = mt.printFileInfos();
		sorter.bubbleSort(fi);
		for(FileInfo f:fi) {
			System.out.println(f);
		}
		
	}
	

}
