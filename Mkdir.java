import java.io.*;

public class Mkdir {
	public static void main(String[] args) {
		try {
			String path = "/Users/lucasgordon/Desktop/week-sixteen/";
			File file = new File(path + args[0]);
			file.mkdir();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
