package tw.org.iii.apps.java;

public class Brad15 {

	public static void main(String[] args) {
		int[] p = new int[7];
		
		for (int i=0; i<1000000; i++) {
			int rand = (int)(Math.random()*9+1);	// 1 - 9
			p[rand>=7?rand-3:rand]++;
		}
		
		if (p[0] == 0) {
			for (int i=1; i<=6; i++) {
				System.out.printf("%d點出現%d次\n", i,p[i]);
			}
		}
		
		
	}

}
