import org.junit.*;
import static org.junit.Assert.*;

public class FileManagerTest {
	@Test
	public void ls() {
		FileManager fileManager = new FileManager();
		String[] fileNames = fileManager.ls();
		for (int i = 0; i < fileNames.length; i++) {
			System.out.println(fileNames[i]);
		}
	}
}
