package tw.brad.apps;

public class Brad34 {
	public static void main(String[] args) {
		Brad341 obj1 = new Brad344();
		Brad341 obj2 = new Brad345();
		Brad344 obj3 = new Brad344();
		System.out.println(obj3 instanceof Brad344);
		System.out.println(obj3 instanceof Brad341);
	}
}
interface Brad341 {
	void m1();
	void m2();
}
interface Brad342 {
	void m2();
	void m3();
}
interface Brad343 extends Brad341, Brad342 {
	void m4();
}
class Brad344 implements Brad341, Brad342 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
}
class Brad345 implements Brad343 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}

abstract class Brad346 {
	void m1() {}
}