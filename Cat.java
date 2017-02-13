import java.io.*;

public class Cat {
	public static void main(String[] args) {
		try {
			String targetFileName = args[0];
			File f = new File("/Users/lucasgordon/Desktop/week-sixteen/");
			File[] files = f.listFiles();
			File file = null;
			for (int i = 0; i < files.length; i++) {
				if (!files[i].getName().equals(targetFileName)) {
					continue;
				}
				file = files[i];
				break;
			}
			if (file == null) {
				System.out.println("File not found.");
				return;
			}
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
