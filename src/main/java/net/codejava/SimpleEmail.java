package net.codejava;



import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleEmail {
	
	
 public static void main(String[] args) {

	SimpleEmail email=new SimpleEmail();
	mailSent();
	
}
 
 public static void mailSent() {
	 String host="smtp.gmail.com";
	  final String user="venkymetla123@gmail.com";//change accordingly
	  final String password="arya123456";//change accordingly
	
	  
	  String address1= "metla.venkatesh@gmail.com";//"metla.venkatesh@gmail.com"};
	  String address6= "aryanabc143@gmail.com";//"metla.venkatesh@gmail.com"};
	  String address2= "venkatmetla47@gmail.com";
	  String[] address= {address1,address2,"aryanabc143@gmail.com"};

	   //Get the session object
	   Properties props = new Properties();
	   props.put("mail.smtp.host",host);
	   props.put("mail.smtp.port",587);
	 
	  props.put("mail.smtp.starttls.enable",true);

	 // props.put("mail.smtp.STARTTLS.enable",true);
	   
	   props.put("mail.smtp.auth", "true");
	   
	   Session session = Session.getDefaultInstance(props,
	    new javax.mail.Authenticator() {
	      protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(user,password);
	      }
	    });

	   //Compose the message
	    try {
	     MimeMessage message = new MimeMessage(session);
	     
	     message.setFrom(new InternetAddress(user));
	     message.addRecipient(Message.RecipientType.TO,new InternetAddress(address1));
	   message.addRecipient(Message.RecipientType.CC,new InternetAddress(address2));
	    
	     message.setSubject("Alert_Preventive_Maintainace");
	     message.setText("Hi this alert for the preventive maintainace CT_Scanner for the following customer");
	     
	    //send the message
	     Transport.send(message);

	     System.out.println("message sent successfully...");
	   
	   
	     
	     
	 
	     } catch (MessagingException e) {e.printStackTrace();}
}
 }
