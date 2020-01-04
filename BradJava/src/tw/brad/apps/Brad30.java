package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad30 extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
	public Brad30() {
		super("Guess Number");
		
		initView();
		
		initRound();
		guess.addActionListener(this);
		
		
		setVisible(true);
		setSize(480, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void initRound() {
		counter = 0;
		answer = createAnswer(3);
		log.setText("");
		System.out.println(answer);
	}
	
	private void initView() {
		setLayout(new BorderLayout());
		JPanel topLine = new JPanel(new BorderLayout());
		guess = new JButton("Guess");
		input = new JTextField();
		topLine.add(guess, BorderLayout.EAST);
		topLine.add(input, BorderLayout.CENTER);
		
		add(topLine, BorderLayout.NORTH);
		
		log = new JTextArea();
		log.setEditable(false);
		JScrollPane jsp = new JScrollPane(log);
		
		
		add(jsp, BorderLayout.CENTER);
	}
	
	
	public static void main(String[] args) {
		new Brad30();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		counter++;
		String userInput = input.getText();
		String result = checkAB(answer, userInput);
		log.append(counter + ". " + userInput + " => " + result +"\n");
		
		input.setText("");
		
		if (result.equals("3A0B")) {
			showPromptDialog(true);
		}else if (counter == 20) {
			showPromptDialog(false);
		}
		
	}
	
	private void showPromptDialog(boolean isWinner) {
		String mesg = isWinner?"WINNER":"Loser: " + answer;
		int yesOrNo = JOptionPane.showConfirmDialog(
				this, mesg + "Play new Game?", "Result", JOptionPane.YES_NO_OPTION);
		if (yesOrNo == JOptionPane.YES_OPTION) {
			initRound();
		}else if (yesOrNo == JOptionPane.NO_OPTION) {
			System.exit(0);
		}
	}
	
	private String createAnswer(int d) {
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

	
	private String checkAB(String a, String g) {
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
}
