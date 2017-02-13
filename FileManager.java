import java.io.*;

public class FileManager {
	static public String[] ls() {
		try {
			File file = new File("/Users/lucasgordon/Desktop/week-sixteen/");
			File[] files = file.listFiles();
			String[] fileNames = new String[files.length];
			for (int i = 0; i < files.length; i++) {
				fileNames[i] = files[i].getName();
			}
			return fileNames;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new String[0];
	}
}
