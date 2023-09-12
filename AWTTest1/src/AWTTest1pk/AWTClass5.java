package AWTTest1pk;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTClass5 extends Frame implements WindowListener{

	public AWTClass5() {
		// TODO Auto-generated constructor stub
		this.setSize(1000, 600);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Hello app5");
		this.setBackground(new Color(0x9bafe8));
		
		this.addWindowListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTClass5 awtcl = new AWTClass5();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window activated");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window closed");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window closing");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window deactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window deiconified");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window iconified");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window opened");
	}

}
