package tw.org.iii.apps.java;

import java.util.Scanner;

public class Brad01 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){System.out.println("XX");}
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
		System.out.printf("%d + %d = %d\n", x, y, r1);
		System.out.printf("%d - %d = %d\n", x, y, r2);
		System.out.printf("%d x %d = %d\n", x, y, r3);
		System.out.printf("%d / %d = %d ...... %d\n", x, y, r4, r5);
		
	}

}
