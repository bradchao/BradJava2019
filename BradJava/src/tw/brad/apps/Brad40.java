package tw.brad.apps;

import java.io.File;

public class Brad40 {
	public static void main(String[] args) {
		File approot = new File(".");
		System.out.println(approot.getAbsolutePath());
		File dir1 = new File("dir1");
		System.out.println(dir1.exists());
		File dir2 = new File("dir2");
		if (!dir2.exists()) {
			dir2.mkdir();
		}
		File dir1234 = new File("dir1/dir2/dir3/dir4");
		if (!dir1234.exists()) {
			dir1234.mkdirs();
		}
		
	}
}
