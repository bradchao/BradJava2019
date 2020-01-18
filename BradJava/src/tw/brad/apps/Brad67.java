package tw.brad.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad67 {

	public static void main(String[] args) {
		// 
		try {
			URL url = new URL(
					"http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			BufferedReader reader = 
				new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line;
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			System.out.println("Step 1 OK");
			parseJSON(sb.toString());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	static void parseJSON(String json) {
		System.out.println(json);
	}
	
	

}
