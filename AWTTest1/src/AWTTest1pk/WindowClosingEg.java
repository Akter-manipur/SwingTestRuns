package AWTTest1pk;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowClosingEg extends Frame{

	public WindowClosingEg() {
		// TODO Auto-generated constructor stub

		this.setSize(500, 500);  
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("window close eg");
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		} );

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowClosingEg wce = new WindowClosingEg();  

	}

}
