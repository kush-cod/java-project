import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class otp extends JFrame implements ActionListener{
	JLabel l;
	JTextField t;
	static String g;
	JButton s;
	public otp() {
		l=new JLabel("please enter otp here");
		l.setBounds(50,20,300, 70);
		l.setFont(new Font("serif",Font.HANGING_BASELINE,30));
	    l.setBackground(new Color(192,192,192));

	     
		t=new JTextField();
		t.setBounds(80,100,200, 50);
		t.setFont(new Font("serif",Font.HANGING_BASELINE,20));
	    t.setBackground(new Color(192,192,192));
		s=new JButton("Submit");
		s.setBounds(80,200,200, 50);
		s.setFont(new Font("serif",Font.HANGING_BASELINE,20));
	    s.setBackground(new Color(192,192,192));
	    g=t.getText();
		
		add(l);
		add(t);
		add(s);
		
		setLayout(null);
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
 
	
}
public class otpvalidate {
	
public static void main(String[] args) {
	otp n=new otp();
}
}
