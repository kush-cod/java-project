import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
class log extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4;
	JPanel heading;
	ImageIcon i1;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	public log() {
		  Font f1=new Font("serif",Font.HANGING_BASELINE,20);
			Font f=new Font("serif",Font.HANGING_BASELINE,40);
			Font f3=new Font("serif",Font.HANGING_BASELINE,20);
			
		//HEADER
		heading =new JPanel();
		heading.setBackground(new Color(0,0,0,80));
		heading.setBounds(0,0,900,70);
		
		l2=new JLabel("TRAIN INSANE OR REMAIN THE SAME");
		l2.setBounds(200,25,400,50);
		l2.setFont(f);
		l2.setForeground(Color.LIGHT_GRAY);
		heading.add(l2);
		//LOGIN
		JPanel pn=new JPanel();
		pn.setLayout(null);
		pn.setBounds(150,90,580,380);
		pn.setBackground(new Color(0,0,0,70));
		
		
		l3=new JLabel("ENTER USERNAME :");
		l3.setForeground(Color.LIGHT_GRAY);
		l3.setBounds(50,50,200,50);
		
		l3.setFont(f3);
		pn.add(l3);
		
		
        t1=new JTextField();
        t1.setBounds(270,60,270,30);
        t1.setFont(f1);
        t1.setBackground(new Color(192,192,192));
        pn.add(t1);
        
        
        l4=new JLabel("ENTER PASSWORD :");
		l4.setForeground(Color.LIGHT_GRAY);
		l4.setBounds(50,200,200,50);
		
		l4.setFont(f3);
		pn.add(l4);
		
		
        p1=new JPasswordField();
        p1.setBounds(270,210,270,30);
        p1.setBackground(new Color(192,192,192));
        p1.setFont(f1);
        pn.add(p1);
      
       
		//button
        JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(150,550,580,100);
		p2.setBackground(new Color(0,0,0,70));
		b1=new JButton("Sign Up");
		b1.setBackground(new Color(96,96,96));
		b1.setForeground(Color.lightGray);
		b1.setFont(f1);
		b1.setBounds(20,20,100,50);
		p2.add(b1);
		b2=new JButton("Login");
		b2.setBounds(440,20,100,50);
		b2.setBackground(new Color(96,96,96));
		b2.setForeground(Color.lightGray);
		b2.setFont(f1);
		p2.add(b2);
		
		
		
		//BACKGROUND
		i1=new ImageIcon(this.getClass().getResource("/p.jpg"));
		Image i=i1.getImage();
		Image i2=i.getScaledInstance(900,700,Image.SCALE_SMOOTH);
		i1=new ImageIcon(i2);
		l1=new JLabel("",i1,JLabel.CENTER);
		l1.setBounds(0,0,900,700);
		add(l1);
		l1.add(heading);
		l1.add(pn);
		l1.add(p2);
		//database coonectivity
		b2.addActionListener(this);
		b1.addActionListener(this);
		
		setTitle(" Login Page");
		setLayout(null);
		setVisible(true);
		setSize(900,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b2) {
		if(t1.getText().equals("") || p1.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"please fill the enteries");
			return;
			
		}

		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties p=new Properties();
			p.load(new FileInputStream("properties2"));
			String url=p.getProperty("url");
			String uname=p.getProperty("uname");
			String pass=p.getProperty("pass");
			String query="Select password from account where user_name='"+t1.getText()+"'";
			Connection c=DriverManager.getConnection(url,uname,pass);
			Statement s=c.createStatement();
			ResultSet st=s.executeQuery(query);
			String passw="";
			while(st.next()) {
				passw=st.getString(1);
				}
			
			if(passw.equals(p1.getText())) {
				JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL");
			}
			else {
				JOptionPane.showMessageDialog(null,"username or password is invalid");
			}
			c.close();
			s.close();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		else if(ae.getSource()==b1) {
			new register();
			dispose();
			
		}
		
		
		
	}
	
}

public class loginpage {
	public static void main(String[] args) {
		new log();
	}


}
