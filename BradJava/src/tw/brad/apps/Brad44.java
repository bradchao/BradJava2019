package tw.brad.apps;

import java.io.File;
import java.io.FileInputStream;

public class Brad44 {
	public static void main(String[] args) {
		try {
			File file = new File("dir2/file3.txt");
			FileInputStream fin = 
				new FileInputStream(file);
			byte[] buf = new byte[(int)file.length()];
			fin.read(buf);
			System.out.println(new String(buf));
			
			fin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
