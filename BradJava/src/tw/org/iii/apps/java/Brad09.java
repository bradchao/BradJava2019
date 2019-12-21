package tw.org.iii.apps.java;

public class Brad09 {
	public static void main(String[] args) {
		int a = 7; final int b = 8;
		switch (a) {	// byte, short, int, char, String, enum
			case 1:
				System.out.println("A");
				break;
			default:
				System.out.println("X");
				//break;
			case b+2:
				System.out.println("B1");
			case 127:
				System.out.println("B2");
				break;
		}
	}
}
