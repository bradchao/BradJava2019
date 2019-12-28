package tw.brad.apps;

public class Brad24 {
	public static void main(String[] args) {
		Brad24 obj = new Brad24();
		String answer = obj.createAnswer(3);
		System.out.println(answer);
		
		
		
	}
	
	String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++)poker[i]=i;
		
		for (int i = poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) {
			sb.append(poker[i]);
		}
	
		return sb.toString();
	}
	
}
