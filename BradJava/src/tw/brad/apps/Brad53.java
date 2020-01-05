package tw.brad.apps;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad53 {
	public static void main(String[] args) {
		try(DataInputStream din = 
				new DataInputStream(
						new FileInputStream("dir2/brad.data"))){
			int v1 = din.readInt();
			double v3 = din.readDouble();
			boolean v2 = din.readBoolean();
			System.out.println(v1 + ":" + v2 + ":" + v3);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
