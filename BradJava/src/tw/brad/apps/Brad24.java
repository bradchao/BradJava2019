package tw.brad.apps;

import javax.swing.JOptionPane;

public class Brad24 {
	public static void main(String[] args) {
		int len = 3;
		Brad24 obj = new Brad24();
		String answer = obj.createAnswer(len);
		System.out.println(answer);
		
		boolean isWinner = false;
		StringBuffer log = new StringBuffer();
		for(int i=0; i<10; i++) {
			String guess = JOptionPane.showInputDialog((i+1)+ " 輸入數字\n" + log.toString());
			
			if (!obj.checkGuess(guess, len)) continue;
			
			String result = obj.checkAB(answer, guess);
			log.append(guess + " => " + result + "\n");
			JOptionPane.showMessageDialog(null, result);
			if (result.equals(len+ "A0B")) {
				isWinner = true;
				break;
			}
		}
		
		if (isWinner) {
			JOptionPane.showMessageDialog(null, "Winner");
		}else {
			JOptionPane.showMessageDialog(null, "Loser: " + answer);
		}
		
		
	}
	
	boolean checkGuess(String g, int len) {
		boolean ret = false;
		if (g.matches("^[0-9]{" + len + "}$")) {
			boolean isDup = false;
			for (int i=0; i<len-1; i++) {
				char c = g.charAt(i);
				if (g.substring(i+1).indexOf(c) >= 0 ) {
					isDup = true;
					break;
				}
			}
			ret = !isDup;
		}else {
			ret = false;
		}
		return ret;
	}
	
	String checkAB(String a, String g) {
		int A, B; A = B = 0;
		for (int i=0; i<a.length(); i++) {
			if (a.charAt(i) == g.charAt(i)) {
				A++;
			}else if(a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return A + "A" + B + "B";
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
