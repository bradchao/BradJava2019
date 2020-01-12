package tw.brad.apps;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad59 {

	public static void main(String[] args) {
		String mesg = "Hello, BradV2";
		byte[] send = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(
					send, send.length, 
					InetAddress.getByName("10.0.103.255"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
