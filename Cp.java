import java.io.*;
import java.util.Scanner;

public class Cp {
	public static void main(String[] args) {
		File f = new File("/Users/lucasgordon/Desktop/week-sixteen/");
		File[] files = f.listFiles();
		
		String source = args[0];
		String target = args[1];

		File sourceFile = null;
		File targetFile = null;

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String fileName = file.getName();
			if (fileName.equals(source)) {
				sourceFile = file;
			} else if (fileName.equals(target)) {
				targetFile = file;
			}
		}

		if (sourceFile == null) {
			System.out.println("Source file does not exist.");
			return;
		}

		if (targetFile != null) {
			System.out.println("Do you want to overwrite this file? Y/N");
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			String response = reader.next();
			if (response == "N") {
				return;
			}
		}

		targetFile = new File("/Users/lucasgordon/Desktop/week-sixteen/" + target);

		try {
			FileInputStream sourceStream = new FileInputStream(sourceFile);
			FileOutputStream destinationStream = new FileOutputStream(targetFile);

			byte[] buffer = new byte[1024];

			int length;
			while ((length = sourceStream.read(buffer)) > 0){
				destinationStream.write(buffer, 0, length);
			}

			sourceStream.close();
			destinationStream.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
