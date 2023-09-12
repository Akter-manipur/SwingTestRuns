package AWTTest1pk;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTClass6 extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("window closing");
		System.exit(0);
	}
}
