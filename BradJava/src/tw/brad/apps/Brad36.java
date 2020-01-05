package tw.brad.apps;

public class Brad36 {
	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] c = {1,2,3,4,5};
		System.out.println("start");
		
		try {
			System.out.println(c[3]);
			System.out.println(a / b);
		}catch(ArithmeticException e) {
			System.out.println("bbbb");
		}catch(RuntimeException e) {
			System.out.println("aaaaa");
		}
		
		System.out.println("end");
	}
	
}
