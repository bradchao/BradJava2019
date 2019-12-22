package tw.org.iii.apps.java;

public class Brad17 {
	public static void main(String[] args) {
		int[][] a;
		a = new int[2][3];
		//System.out.println(a[0].length);
		
		for (int j=0; j<a.length; j++) {
			for (int i=0; i<a[j].length; i++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("------");
		
		for (int[] sub: a) {
			for (int v : sub) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		
		System.out.println("------");
		
		int[][] b = new int[2][];
		b[0] = new int[3];
		b[1] = new int[4];
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		for (int j=0; j<b.length; j++) {
			for (int i=0; i<b[j].length; i++) {
				System.out.print(b[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------");
		
		for (int[] sub: b) {
			for (int v : sub) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		
		
	}
}
