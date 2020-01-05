package tw.brad.apps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Brad51 {

	public static void main(String[] args) {
		try {
			BufferedReader reader = 
					new BufferedReader(
							new FileReader("dir2/Book1.csv"));
			
			String line;
			while ( (line = reader.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println(data[2]);
				
			}
			
			reader.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
