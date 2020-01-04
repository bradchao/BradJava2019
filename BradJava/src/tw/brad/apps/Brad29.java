package tw.brad.apps;

import tw.org.iii.apps.tools.Student;

public class Brad29 {

	public static void main(String[] args) {
		Brad291 obj1 = new Brad291();
		Brad292 obj2 = new Brad292();
		Student obj3 = new Student("Brad");
		doSomething(obj1);
	}
	
	static void doSomething(Javaer javaer) {
		javaer.OCAJP();
	}
}

interface Javaer {
	void OCAJP();
	void OCPJP();
}
class Brad291 implements Javaer {
	public void OCAJP() {System.out.println("A");}
	public void OCPJP() {}
}
class Brad292 implements Javaer {
	public void OCAJP() {System.out.println("B");}
	public void OCPJP() {}
}

