package tw.brad.apps;

import java.io.File;

public class Brad41 {

	public static void main(String[] args) {
		File dir2 = new File("dir2");
		File[] files = dir2.listFiles();
		for (File file : files) {
			System.out.println(file.getName() + ":" +
					file.length() + ":" +
					file.lastModified());
		}
		
		
	}

}
