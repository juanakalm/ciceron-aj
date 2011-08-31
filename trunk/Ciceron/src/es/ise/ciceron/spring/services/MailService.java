package es.ise.ciceron.spring.services;

import java.net.MalformedURLException;
import java.util.Properties;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;


@Service
public class MailService {
	
	private JavaMailSender mailSender;
	
	private MailPreparator mailPreparator;
	
	@Autowired
	public void setMailSender(JavaMailSender mailSender){
		this.mailSender = mailSender;
	}
	
	@Autowired
	public MailService(@Qualifier("appProperties") Properties props) throws MalformedURLException, ServiceException
	{
		mailPreparator = new MailPreparator(props);
	}
	
	public synchronized void sendMail(String mail, String to) throws AddressException{
		mailPreparator.setMail(mail);
		mailPreparator.setTo(new InternetAddress(to));
		mailSender.send(mailPreparator);
	}
	
	public class MailPreparator implements MimeMessagePreparator{
		private InternetAddress from;
		private String subject;
		private InternetAddress to;
		private String mail;
		
		public InternetAddress getTo()	{
			return to;
		}

		public void setTo(InternetAddress to)	{
			this.to = to;
		}

		public String getMail()	{
			return mail;
		}

		public void setMail(String mail)	{
			this.mail = mail;
		}

		
		public MailPreparator (Properties props){
			String charset = props.getProperty("mail.charset", "ISO-8859-1");
			try{
				from = new InternetAddress(props.getProperty("mail.from.mail"), props.getProperty("mail.from.name"), charset);
				subject = new String(props.getProperty("mail.subject"));
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Autowired
		public void prepare(MimeMessage mimeMessage) throws Exception{
			MimeMessageHelper msg = new MimeMessageHelper(mimeMessage);
			msg.setFrom(from);
			msg.setSubject(subject);
			msg.setTo(to);
			msg.setText(mail);
		}
		
	}
}
