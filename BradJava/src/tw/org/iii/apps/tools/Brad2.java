package tw.org.iii.apps.tools;

public class Brad2 {
	public static void main(String[] args) {
		//Brad22 obj1 = new Brad22();
		//System.out.println(obj1.a);
		
//		Brad21.m1();
//		Brad21.m1();
//		Brad21.m1();

//		Brad21 obj1 = new Brad21();
//		Brad21 obj2 = new Brad21();
//		Brad21 obj3 = new Brad21();
		
		//Brad22.m2();
		
		Brad22 obj1 = new Brad22();
		
	}
}

class Brad21 {
	int a = 12;
	public Brad21(){
		System.out.println("Brad21()");
	}
	{
		System.out.println("{} a = " + a);
	}
	static {
		System.out.println("static Brad21{}");
	}
	static void m1() {System.out.println("static Brad21 m1()");}
}
class Brad22 extends Brad21 {
	Brad22(){
		System.out.println("Brad22()");
	}
	{
		System.out.println("Brad22.{}");
	}
	static {
		System.out.println("static Brad22{}");
	}
	static void m2() {System.out.println("static Brad22 m2()");}
	
}
