package tw.brad.apps;

import java.io.File;

public class Brad39 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		File test1 = new File("c:/brad/dir1");
		System.out.println(test1.exists());
		
		File[] roots = File.listRoots();
		for (File root: roots) {
			System.out.println(root.getAbsolutePath());
		}
		
		
	}

}
