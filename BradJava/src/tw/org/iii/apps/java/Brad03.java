package tw.org.iii.apps.java;

import javax.swing.JOptionPane;

public class Brad03 {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Input a number");
		String y = JOptionPane.showInputDialog("Input a number");
		
		int intX = Integer.parseInt(x);
		int intY = Integer.parseInt(y);
		int intR = intX + intY;
		JOptionPane.showMessageDialog(null, intX + "+" 
		+ intY+"=" +intR);
		
		
	}

}
