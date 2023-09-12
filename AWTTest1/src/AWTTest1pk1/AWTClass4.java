package AWTTest1pk1;

import java.awt.Color;
import java.awt.Frame;

import AWTTest1pk.AWTClass3;

public class AWTClass4 extends Frame {

	public AWTClass4() {
		// TODO Auto-generated constructor stub
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Hello app4");
		
		
		this.setBackground(new Color(0xdd77ed));
		
		this.addWindowListener(new AWTClass3());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTClass4 awobj = new AWTClass4();


	}

}
