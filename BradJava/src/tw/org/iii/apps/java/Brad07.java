package tw.org.iii.apps.java;

import java.util.Scanner;

public class Brad07 {
	public static void main(String[] args) {
		System.out.print("Input year: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 2000: 29
				}else {
					// 2100: 28
				}
			}else {
				// 2016: 29
			}
		}else {
			// 28
		}
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			// 29
		}else {
			// 28
		}
		
	}
}
