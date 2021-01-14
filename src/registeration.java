




import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Properties;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class register extends JFrame{

    JPanel p;
     JTextField firstname;
     JTextField lastname;
     JTextField email;
     JTextField weight;
     JTextField age;
     
    JTextField username,ottp;
     JTextField mob;
     JPasswordField passwordField;
   JButton btnNewButton,clear;
   JLabel l1;
   JRadioButton r1,r2;
   JButton jButton; 
   
   JLabel l;
	JTextField t;
	static String g;
	JButton s;
  
   
   public register() {
	   //panel
	   p=new JPanel();
	   p.setLayout(null);
	   p.setBounds(100, 100,1000,700);
	   p.setBackground(new Color(0,0,0,90));
	   
	   JLabel lblNewUserRegister = new JLabel("New User Register");
       lblNewUserRegister.setFont(new Font("serif",Font.HANGING_BASELINE,40));
       lblNewUserRegister.setBounds(399, 40, 400, 70);
       lblNewUserRegister.setForeground(Color.LIGHT_GRAY);
       
       p.add(lblNewUserRegister);

       JLabel lblName = new JLabel("First name");
       lblName.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lblName.setForeground(Color.LIGHT_GRAY);
       lblName.setBounds(58, 152, 99, 43);
       p.add(lblName);

       JLabel lblNewLabel = new JLabel("Last name");
       lblNewLabel.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lblNewLabel.setForeground(Color.LIGHT_GRAY);
       lblNewLabel.setBounds(58, 243, 110, 29);
       p.add(lblNewLabel);

       JLabel lblEmailAddress = new JLabel("Email\r\n address");
       lblEmailAddress.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lblEmailAddress.setForeground(Color.LIGHT_GRAY);
       lblEmailAddress.setBounds(58, 324, 124, 36);
       p.add(lblEmailAddress);
       
       JLabel w = new JLabel("Current Weight");
       w.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       w.setForeground(Color.LIGHT_GRAY);
       w.setBounds(58, 405, 130, 36);
       p.add(w);

       firstname = new JTextField();
       firstname.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       firstname.setBackground(new Color(192,192,192));
       firstname.setBounds(214, 151, 228, 40);
       p.add(firstname);
       firstname.setColumns(10);

       lastname = new JTextField();
       lastname.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lastname.setBackground(new Color(192,192,192));
       lastname.setBounds(214, 235, 228, 40);
       p.add(lastname);
       lastname.setColumns(10);

       email = new JTextField();
       email.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       email.setBackground(new Color(192,192,192));
       email.setBounds(214, 320, 228, 40);
       p.add(email);
       email.setColumns(10);
       
         
       weight = new JTextField();
       weight.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       weight.setBackground(new Color(192,192,192));
       weight.setBounds(214, 405, 228, 40);
       p.add(weight);
       weight.setColumns(10);

       username = new JTextField();
       username.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       username.setBackground(new Color(192,192,192));
       username.setBounds(707, 151, 228, 40);
       p.add(username);
       username.setColumns(10);

       JLabel lblUsername = new JLabel("Username");
       lblUsername.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lblUsername .setForeground(Color.LIGHT_GRAY);
       lblUsername.setBounds(542, 159, 99, 29);
       p.add(lblUsername);

       JLabel lblPassword = new JLabel("Password");
       lblPassword.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lblPassword.setForeground(Color.LIGHT_GRAY);
       lblPassword.setBackground(new Color(192,192,192));
       lblPassword.setBounds(542, 245, 99, 24);
       p.add(lblPassword);

       JLabel lblMobileNumber = new JLabel("Mobile number");
       lblMobileNumber.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       lblMobileNumber.setForeground(Color.LIGHT_GRAY);
       lblMobileNumber.setBounds(542, 329, 139, 26);
       p.add(lblMobileNumber);
       
       JLabel a = new JLabel("Enter Age");
       a.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       a.setForeground(Color.LIGHT_GRAY);
       a.setBounds(542, 409, 99, 26);
       p.add(a);

       mob = new JTextField();
       mob.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       mob.setBackground(new Color(192,192,192));
       mob.setBounds(707, 320, 228, 40);
       p.add(mob);
       mob.setColumns(10);
       
       age = new JTextField();
       age.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       age.setBackground(new Color(192,192,192));
       age.setBounds(707, 405, 228, 40);
       p.add(age);
       mob.setColumns(10);

       passwordField = new JPasswordField();
       passwordField.setFont(new Font("serif",Font.HANGING_BASELINE,20));
       passwordField.setBackground(new Color(192,192,192)); 
       passwordField.setBounds(707, 235, 228, 40);
       p.add(passwordField);
       
      
    
       
	   //background
	   ImageIcon i=new ImageIcon(this.getClass().getResource("/kj.jpg"));
	   Image i1=i.getImage();
	   Image i2=i1.getScaledInstance(1200,900,i1.SCALE_SMOOTH);
	   i=new ImageIcon(i2);
	   l1=new JLabel("",i,JLabel.CENTER);
	   l1.setBounds(0,0,1200,900);
	   add(l1);
	   l1.add(p);
	   setTitle("register here");
	   setLayout(null);
	   setVisible(true);
	setSize(1200,900);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
   
     
   
        
         
   
      
       btnNewButton = new JButton("Register");
       btnNewButton.setFont(new Font("serif",Font.HANGING_BASELINE,20));
        btnNewButton.setBounds(700, 547, 259, 74);
       p.add(btnNewButton);
       clear = new JButton("Clear All");
       clear.setFont(new Font("serif",Font.HANGING_BASELINE,20));
        clear.setBounds(58, 547, 259, 74);
       p.add(clear);
       clear.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   firstname.setText("");
    		   lastname.setText("");
    		   email.setText("");
    		   weight.setText("");
    		   age.setText("");
    		   username.setText("");
    		   mob.setText("");
    		   passwordField.setText("");
    		   weight.setText("");
    		   age.setText("");
    		   
    		   
    		  
    		   
       }
       });
       btnNewButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String firstName = firstname.getText();
               String lastName = lastname.getText();
               String emailId = email.getText();
               String userName = username.getText();
               String mobileNumber = mob.getText();
               String weig=weight.getText();
               String Age=age.getText();
               int len = mobileNumber.length();
               String password = passwordField.getText();
        
              

               String msg = "" + firstName;
               msg += " \n";
               if(firstName.equals("") || lastName.equals("") || emailId.equals("") || userName.equals("") || mobileNumber.equals("") || password.equals("") || weig.equals("") || Age.equals("") ) {
            	   JOptionPane.showMessageDialog(null,"please fill all the enteries");
            	   return;
               }
               if (len != 10) {
                   JOptionPane.showMessageDialog(null, "Enter a valid mobile number");
                   return;
               }
               

               try {
               	Class.forName("com.mysql.cj.jdbc.Driver");
       			Properties p=new Properties();
       			p.load(new FileInputStream("properties2"));
       			String url=p.getProperty("url");
       			String uname=p.getProperty("uname");
       			String pass=p.getProperty("pass");
                   Connection connection = DriverManager.getConnection(url,uname,pass);
                   Statement sta = connection.createStatement();
                   String q="select * from account where user_name='"+userName+"' and password='"+ password+"'";
                   ResultSet rs=sta.executeQuery(q);
                   if(rs.next()==true) {
                	   JOptionPane.showMessageDialog(null, "already registered with these details");
                	   
                   }
                   
                   else {
                       try {
           				javamailutil.sendMail(emailId);
           			} catch (IOException e1) {
           				// TODO Auto-generated catch block
           				e1.printStackTrace();
           			} catch (Exception e1) {
           				// TODO Auto-generated catch block
           				e1.printStackTrace();
           			}
                       
                   	
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
                   		
                	
                		 
                		 s.addActionListener(new ActionListener() {
                	           public void actionPerformed(ActionEvent e) {
                	        	   try {
                	       			Properties p=new Properties();
                	       			
										p.load(new FileInputStream("properties2"));
									
                	       			String url=p.getProperty("url");
                	       			String uname=p.getProperty("uname");
                	       			String pass=p.getProperty("pass");
                	                   Connection connection = DriverManager.getConnection(url,uname,pass);
                	                   Statement sta = connection.createStatement();
                	     
            	    		   if(otp.g==javamailutil.generateOTP()) {
            	    			   String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
            	                           password + "','" + emailId + "','" + mobileNumber + "','" + weig + "','" + Age + "')";

            	                       
            	                       int x = sta.executeUpdate(query);
            	                       if (x == 0) {
            	                           JOptionPane.showMessageDialog(null, "This is alredy exist");
            	                       } 
            	                       
            	                       else {
            	                           JOptionPane.showMessageDialog(null,
            	                               "Welcome user UYour account is sucessfully created");
            	                       }
            	    		   }
            	    		   
            	                       
            	    		   else {
            	    			   JOptionPane.showMessageDialog(null,"this otp is incorrect");
            	    			   return;
            	    		   }
            	    		   connection.close();
            	    		   }
            	    		   catch(Exception ex) {
            	    			   ex.printStackTrace();
            	    		   }
            	    		   
                	           }
                		 });
            	    	   
                	           }
                		 }
                  
                	   
                   
           
            	    		   
            	    		  
            	    	   
               catch (Exception exception) {
                   exception.printStackTrace();
               }
                   } 
               
               
   
	   
	
   
	   
});
   }
}
	   
       
      
public class registeration {
	public static void main(String [] args) {
		register r=new register();
		
	}
}


     


