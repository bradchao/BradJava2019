package tw.brad.apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad48 {
	public static void main(String[] args) {
		File src = new File("dir2/brad.mp4");
		File dst = new File("dir1/brad.mp4");
		try {
			long start = System.currentTimeMillis();
			FileInputStream fin = 
					new FileInputStream(src);
			byte[] buf = new byte[(int)src.length()];
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(dst);
			fout.write(buf);
			fout.flush();
			fout.close();
			
			System.out.println(System.currentTimeMillis()-start);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
