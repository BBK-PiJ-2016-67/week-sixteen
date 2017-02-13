import java.io.*;

public class Ls {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/lucasgordon/Desktop/week-sixteen/");
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
