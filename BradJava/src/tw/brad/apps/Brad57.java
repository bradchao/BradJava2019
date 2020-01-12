package tw.brad.apps;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad57 {

	public static void main(String[] args) {
		Brad573 obj = new Brad573();
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir2/brad.object"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("----------------");
		
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir2/brad.object"));
			Object obj2 = oin.readObject();
			oin.close();
			System.out.println("read OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
class Brad571 {
	Brad571(){System.out.println("Brad571()");}
}
class Brad572 extends Brad571 {
	Brad572(){System.out.println("Brad572()");}
}
class Brad573 extends Brad572 implements Serializable {
	Brad573(){System.out.println("Brad573()");}
}