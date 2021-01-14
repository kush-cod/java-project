import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class javamailutil {
	
	
		    public static String generateOTP()  
		    {  
		        int randomPin   =(int) (Math.random()*9000)+1000; 
		        String otp  = String.valueOf(randomPin); 
		        return otp; 
		    }
	public static void sendMail(String recepient) throws IOException, Exception {
		
		Properties p1=new Properties();
		p1.put("mail.smtp.auth","true");
		p1.put("mail.smtp.starttls.enable", "true");
		p1.put("mail.smtp.host","smtp.gmail.com");
		p1.put("mail.smtp.port","587");
		p1.load(new FileInputStream("p"));
		String email=p1.getProperty("gmail");
		String pass=p1.getProperty("pass");
	
		Session session=Session.getInstance(p1, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication (email,pass);
			}
			
		
			
		});
			
			
		Message m=prepareMessage(session,email,recepient);
		Transport.send(m);
		
		System.out.println("message sent");
		
		
	}
	private static Message prepareMessage(Session session, String email, String recepient) {
		String b=" ";
		 try {

				Message m=new MimeMessage(session);
			m.setFrom(new InternetAddress(email));
			m.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			m.setSubject("please verify your account");
			m.setText("your otp to register is  "+generateOTP());
			b=generateOTP();			
			return m;
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(javamailutil.class.getName()).log(Level.SEVERE,	null,ex);
		}
		 return null;
	}
	
	
}
		
	


