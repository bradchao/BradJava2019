package tw.org.iii.apps.java;

public class Brad12 {
	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			if (i==17) {
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Over");
	}
}
