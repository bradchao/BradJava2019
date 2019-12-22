package tw.org.iii.apps.java;

public class Brad18 {

	public static void main(String[] args) {
		int a = -7, b = 4;
		a = a + b;	// a = 13
		b = a - b;	// b = 10
		a = a - b;	// a = 3
		System.out.printf("a = %d, b = %d\n", a, b);
		
		int i = 0;
		String[] mesg = {"OK","XX"};
		System.out.println(mesg[i]);
		i ^=  1;
		System.out.println(mesg[i]);
		i ^= 1;
		System.out.println(mesg[i]);
		
		
	}

}
