package tw.brad.apps;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad61 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("127.0.0.1"), 7777);
			OutputStream out = socket.getOutputStream();
			
			out.write("Hello, Brad\nHello, OK".getBytes());
			
			out.flush();
			out.close();
			socket.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
