package tw.org.iii.apps.java;

public class S001 {

	public static void main(String[] args) {
		int target = 26;
		int[] b = new int[2];
		int[] a = new int[] { 2, 7, 11, 15 };
		for (int i = 0; i < a.length + 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					b[0] = a[i];
					b[1] = a[j];
					System.out.println(b[0]);
				}
			}
		}
	}

}
