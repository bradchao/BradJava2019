package tw.brad.apps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Brad50 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("dir2/Book1.csv");
			InputStreamReader irs = 
					new InputStreamReader(fin);
			BufferedReader reader = 
					new BufferedReader(irs);
			String line;
			while ( (line = reader.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println(data[1]);
				
			}
			
			fin.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
