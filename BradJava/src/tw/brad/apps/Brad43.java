package tw.brad.apps;

import java.io.FileInputStream;

public class Brad43 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = 
				new FileInputStream("dir2/file3.txt");
			int c;
			while ( (c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
//			while (fin.available() > 0) {
//				System.out.print((char)fin.read());
//			}
			
			
			fin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
