package tw.org.iii.apps.java;

public class Brad06 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101);	// 0 - 100
		System.out.println(score);
		if (score >= 90) { 
			System.out.println("A");
		}else if (score >= 80) { 
			System.out.println("B");
			//score = 76;
		}else if (score >= 70) { 
			System.out.println("C");
		}else if (score >= 60) { 
			System.out.println("D");
		}else { 
			System.out.println("E");
		}
		
		
		

	}

}
