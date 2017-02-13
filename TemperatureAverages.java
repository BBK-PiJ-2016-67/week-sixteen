import java.io.*;
import java.util.*;

public class TemperatureAverages {
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
				int sum = 0;
				int values = 0;
				while (line != null) {
					List<String> list = Arrays.asList(line.split(","));
					int lineSum = 0;
					for (int x = 0; x < list.size(); x++) {
						int value = Integer.parseInt(list.get(x));
						lineSum += value;
						sum += value;
						values += 1;
					}
					System.out.println(lineSum / list.size());
					line = in.readLine();
				}
				System.out.println(sum / values);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
