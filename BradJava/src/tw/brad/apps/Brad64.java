package tw.brad.apps;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad64 {

	public static void main(String[] args) {
		try {
			URL url = new URL(
					"https://upload.wikimedia.org/wikipedia/commons/4/45/A_small_cup_of_coffee.JPG");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();

			BufferedInputStream bin = 
				new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bout = 
				new BufferedOutputStream(
					new FileOutputStream("dir2/coffee.jpg"));
			
			byte[] buf = new byte[1024*1024]; int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}

			bout.flush();
			bout.close();
			bin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
