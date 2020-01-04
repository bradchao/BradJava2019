package tw.brad.apps;

public class Brad32 {
	public static void main(String[] args) {
		Brad321 obj1 = new Brad322();
		Brad321 obj2 = new Brad323();
		obj1.m3();
		obj2.m3();
	}
}

abstract class Brad321 {
	void m1() {}
	void m2() {}
	abstract void m3();
}
class Brad322 extends Brad321 {
	void m3() {System.out.println("Brad322:m3()");}
}
class Brad323 extends Brad321 {
	void m3() {System.out.println("Brad323:m3()");}
}

