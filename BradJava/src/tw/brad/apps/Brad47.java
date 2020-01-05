package tw.brad.apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad47 {
	public static void main(String[] args) {
		File src = new File("dir2/brad.mp4");
		File dst = new File("dir1/brad.mp4");
		try {
			long start = System.currentTimeMillis();
			FileInputStream fin = 
					new FileInputStream(src);
			FileOutputStream fout = 
					new FileOutputStream(dst);
			int len; byte[] buf = new byte[4096*1024];
			while ( (len = fin.read(buf)) != -1) {
				fout.write(buf,0,len);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			System.out.println(System.currentTimeMillis()-start);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
