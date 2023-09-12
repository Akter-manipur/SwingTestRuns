package AWTTest1pk1;

import javax.swing.*;  
import java.awt.event.*;  
public class twoButtons implements ActionListener{  
    JTextField tf1,tf2,tf3;  
    JButton b1,b2;  
    JLabel l1,l2;  

    twoButtons(){  
    	
        JFrame f= new JFrame();  
        
        l1=new JLabel("Username:");  
        l1.setBounds(50,50, 100,30);  
        l2=new JLabel("Password:");  
        l2.setBounds(50,100, 100,30);  
        f.add(l1); f.add(l2);  
        tf1=new JTextField();  
        tf1.setBounds(200,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(200,100,150,20);  
        tf3=new JTextField();  
        tf3.setBounds(10,300,460,50);  
        tf3.setEditable(false);
        
        
        b1=new JButton("Register");  
        b1.setBounds(50,400,150,50);  
        b2=new JButton("Login");  
        b2.setBounds(250,400,150,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);  
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  

        if(e.getSource()==b1){  
            tf3.setText("youre registered as "+ s1 +" with password "+ s2);
        }else if(e.getSource()==b2){  
        	tf3.setText("logged in as "+s1 +" with passwors as "+ s2);
        }  
  
    }  
public static void main(String[] args) {  
    new twoButtons();  
} }  