package AWTTest1pk1;

import java.awt.Frame;

import AWTTest1pk.AWTClass6;

public class AWTClass6A extends Frame{

	public AWTClass6A() {
		// TODO Auto-generated constructor stub

		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Hello app6");
		
		this.addWindowListener(new AWTClass6());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTClass6A awtobj = new AWTClass6A();
	}

}
