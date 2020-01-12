package tw.brad.apps;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad56 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("dir2/s1.score");
			ObjectInputStream oin = 
					new ObjectInputStream(fin);

			while (true) {
				try {
					Student s = (Student)oin.readObject();
					System.out.println(s.getScore());
				}catch(EOFException e) {
					break;
				}
			}
			
			fin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
