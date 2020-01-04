package tw.brad.apps;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad28 extends JFrame implements ActionListener{
	private JButton open, close, exit;
	
	public Brad28() {
		super("偶的視窗城市");
		
		setLayout(new FlowLayout());
		
		open = new JButton("Open");
		close = new JButton("Close");
		exit = new JButton("Exit");
		
		add(open); add(close); add(exit);
		
		open.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
	
	public static void main(String[] args) {
		new Brad28();
	}

}
