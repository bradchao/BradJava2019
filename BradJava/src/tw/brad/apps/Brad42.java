package tw.brad.apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Brad42 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = 
				new FileOutputStream("dir2/file4.txt");
			fout.write("Hello, World".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
