import java.io.*;
import java.util.Arrays;

public class Cat {
	public static void main(String[] args) {
		try {
			File f = new File("/Users/lucasgordon/Desktop/week-sixteen/");
			File[] files = f.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (Arrays.asList(args).indexOf(files[i].getName()) == -1) {
					continue;
				}
				BufferedReader in = new BufferedReader(new FileReader(files[i]));
				String line = in.readLine();
				while (line != null) {
					System.out.println(line);
					line = in.readLine();
				}
				System.out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
