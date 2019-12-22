package tw.org.iii.apps.java;

public class Brad19 {
	public static void main(String[] args) {
		int i = 0, sum = 0, last = 9487;
		while (i<=last) {
			//sum += i++;
			
//			sum += i;
//			i++;
			
			sum = sum + i;
			i = i + 1;
		}
		System.out.printf("1 + 2 + ...... + %d = %d", last, sum);
	}

}
