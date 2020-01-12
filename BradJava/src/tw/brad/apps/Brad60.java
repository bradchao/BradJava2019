package tw.brad.apps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad60 {

	public static void main(String[] args) {
		while(true) {
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = 
					new DatagramSocket(8888);
				DatagramPacket packet = 
					new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				
				InetAddress urip = packet.getAddress();
				byte[] data = packet.getData();
				int len = packet.getLength();
				String mesg = new String(data,0,len);
				System.out.println(urip.getHostAddress() +":" + mesg);

				if (mesg.equals("bye")) {
					break;
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
