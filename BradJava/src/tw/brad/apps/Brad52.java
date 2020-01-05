package tw.brad.apps;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad52 {
	public static void main(String[] args) {
		try (FileOutputStream fout = 
				new FileOutputStream("dir2/brad.data");
				DataOutputStream dout = 
					new DataOutputStream(fout)
				){
			dout.writeInt(123);
			dout.writeBoolean(true);
			dout.writeDouble(12.3);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
