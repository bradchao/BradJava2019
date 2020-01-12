package tw.brad.apps;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad62 {

	public static void main(String[] args) {
		while (true) {
			try {
				ServerSocket server = new ServerSocket(7777);
				Socket socket = server.accept();
				InputStream in = socket.getInputStream();
				
				InetAddress urip = socket.getInetAddress();
				System.out.println(urip.getHostAddress());
				
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(in));
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				in.close();
				server.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
