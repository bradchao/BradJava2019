package tw.brad.apps;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Brad35 extends JFrame {
	private JTextField mesg;
	
	public Brad35() {
		super("Brad35");
		
		setLayout(new BorderLayout());
		mesg = new JTextField();
		add(mesg, BorderLayout.NORTH);
		
		JPanel content = new JPanel();
		add(content, BorderLayout.CENTER);
		
		//content.addMouseListener(new MyListener(this));
		content.addMouseListener(new MyListenerV2());
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setMesg(String info) {
		mesg.setText(info);
	}
	public static void main(String[] args) {
		new Brad35();
	}
	
	private class MyListenerV2 extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			mesg.setText(e.getX() + ", " + e.getY());
		}
	}

}

class MyListener extends MouseAdapter {
	private Brad35 win;
	public MyListener(Brad35 win) {
		this.win = win;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Click:" + e.getX() + ", " + e.getY());
		win.setMesg(e.getX() + ", " + e.getY());
	}
	
}


