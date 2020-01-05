package tw.brad.apps;

import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;

public class Brad37 {

	public static void main(String[] args) {
		Brad371 obj1 = new Brad371();
		try {
			obj1.m1(1);
		}catch(Exception e) {
			
		}
	}

}

class Brad371 {
	void m1(int a) throws IOException, Exception{
		if (a == 7) {
			throw new Exception();
			//throw new RuntimeException();
		}else {
			System.out.println("OK");
		}
	}
}
