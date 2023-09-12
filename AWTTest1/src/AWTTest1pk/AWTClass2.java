package AWTTest1pk;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTClass2 extends Frame
{

	public AWTClass2() 
	{
		// TODO Auto-generated constructor stub
		Label l1 = new Label("Username :");
		Label l2 = new Label("password :");
		
		TextField t1 = new TextField("hect@gmail");
		t1.setEditable(false);
		System.out.println(t1.isEditable());
		TextField t2 = new TextField(30);
		t2.setEchoChar('*');

		
		Button b1=new Button();
		b1.setLabel("Login");
		Button b2=new Button();
		b2.setLabel("Sign Up");
		System.out.println(b1.getLabel());
		
		
		l1.setBounds(50,50,100,50);
		t1.setBounds(150 , 60, 200,25);
		l2.setBounds(50, 100 , 100 , 50 );
		t2.setBounds(150 , 110 , 200 , 25 );
		b1.setBounds( 50 , 150, 100, 40);
		b2.setBounds( 200 , 150 , 100, 40);
		
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b1);
		this.add(b2);
		
		this.setSize(1000, 600);
		this.setLayout(null);
		this.setVisible(true);
		this.setTitle("Hello app2");

		Font f =new Font("consolas",3,15);
		this.setFont(f);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AWTClass2 aw = new AWTClass2();

	}

}
