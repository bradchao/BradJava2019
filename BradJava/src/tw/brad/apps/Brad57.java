package tw.brad.apps;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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
	}

}
class Brad571 {
	Brad571(){System.out.println("Brad571()");}
}
class Brad572 extends Brad571 {
	Brad572(){System.out.println("Brad572()");}
}
class Brad573 extends Brad572 {
	Brad573(){System.out.println("Brad573()");}
}