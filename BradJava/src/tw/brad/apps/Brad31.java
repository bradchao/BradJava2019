package tw.brad.apps;

public class Brad31 {
	public static void main(String[] args) {
		Brad311 obj1 = new Brad311();
		Brad312 obj2 = new Brad312();
		obj1.m1();
		obj2.m1();
		Brad311 obj3 = new Brad312();
		obj3.m1();
		//obj3.m2();
		((Brad312)obj3).m2();
		
		//Brad312 obj4 = new Brad311();
		//((Brad312)obj1).m2();
		System.out.println("-----");
		test1(obj2);
		System.out.println("-----");

		obj1.m1();
		obj2.m1();
		obj3.m1();
		
		String s1= "Brad";
//		if (s1 instanceof Brad311) {
//			
//		}
		
	}
	
	static void test1(Brad311 objx) {
		objx.m1();
		
		if (objx instanceof Brad312) {
			((Brad312)objx).m2();
		}
		
	}
	
}

class Brad311 {
	int a = 10;
	void m1() {System.out.println("Brad311:m1()" + a);}
}
class Brad312 extends Brad311 {
	int a = 20;
	void m1() {System.out.println("Brad312:m1()" + a + ":" + super.a);}
	void m2() {System.out.println("Brad312:m2()");}
}
