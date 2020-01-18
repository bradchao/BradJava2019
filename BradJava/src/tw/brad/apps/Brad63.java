package tw.brad.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad63 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://tw.stock.yahoo.com/q/bc?s=2330");
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = 
				new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
