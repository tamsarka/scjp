package folder;

import java.io.File;
import java.util.ArrayList;


public class CompareFolder {

	
	private ArrayList<String> compareDir(File sourcePath, File destinationPath){
		File[] sourceFiles = sourcePath.listFiles();
		File destinationFiles[] = destinationPath.listFiles();
		ArrayList<String> missingFiles = new ArrayList<>();
		
		for(File file : sourceFiles){
			if(!isPresent(destinationFiles, file.getName())){
				missingFiles.add(file.getName());
				System.out.println(file.getName());
			}
		}
		return missingFiles;
	}
	
	private boolean isPresent(File[] destinationFiles, String fileName){
		for(File file : destinationFiles){
			if(file.getName().equals(fileName)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		CompareFolder folder = new CompareFolder();
		folder.compareDir(new File("D:\\Here\\egis\\repo\\egis\\egis\\EGIS\\EgisServices\\target\\EgisServices\\WEB-INF\\lib"),
				new File("D:\\egis\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\EgisServices\\WEB-INF\\lib"));
		
	}

}
