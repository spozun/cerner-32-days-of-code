import java.io.File;
import java.util.ArrayList;

public class walkFileTree {

	static ArrayList<String> walk(String path, ArrayList<String> fileNames) {
		File root = new File(path);
		File[] list = root.listFiles();

		for (File f : list) {
			if (f.isDirectory()) {
				walk(f.getAbsolutePath(), fileNames);
			} else {
				String fileNameAndPath = f.getAbsoluteFile().toString();
				fileNames.add(fileNameAndPath);
			}
		}
		return fileNames;
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String folderToWalk = "C:\\temp";

		walk(folderToWalk, list);

		System.out.println( list );
	}
}