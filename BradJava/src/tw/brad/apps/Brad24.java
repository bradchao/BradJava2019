package tw.brad.apps;

import javax.swing.JOptionPane;

public class Brad24 {
	public static void main(String[] args) {
		Brad24 obj = new Brad24();
		String answer = obj.createAnswer(3);
		//System.out.println(answer);
		
		boolean isWinner = false;
		for(int i=0; i<10; i++) {
			String guess = JOptionPane.showInputDialog("輸入數字");
			String result = obj.checkAB(answer, guess); 
			JOptionPane.showMessageDialog(null, result);
			if (result.equals("3A0B")) {
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
