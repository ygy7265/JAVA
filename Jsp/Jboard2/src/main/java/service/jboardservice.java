package service;

import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.TermsDAO;
import dao.UserDAO;
import dto.TermsDTO;
import dto.UserDTO;

public class jboardservice {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	TermsDAO termsdao = new TermsDAO();
	public TermsDTO selectTerms() {
		return termsdao.selectTerms();
	}
	
	UserDAO userdao = UserDAO.getInstance(); 
	
	public void insertUesr(UserDTO dto) {
		userdao.insertUser(dto);
	}
	
	public UserDTO loginUser(String uid,String pass) {
		return userdao.selectUsers(uid, pass);
	}
	
	public int CheckUid(String uid) {
		return userdao.selectCountUid(uid);
	}
	
	public int selectCountNick(String nick) {
		return userdao.selectCountNick(nick);
	}
	public int selectCountHp(String hp) {
		return userdao.selectCountHp(hp);
	}
	public int selectCountEmail(String email) {
		return userdao.selectCountEmail(email);
	}
	public int selectCountNameAndEmail(String name,String email) {
		return userdao.selectCountNameAndEmail(name,email);
	}
	public UserDTO selectUserByNameAndEmail(String name,String email) {
		return userdao.selectUserByNameAndEmail(name,email);
	}
	
	
	private static int gratecode;
	//receiver 받는사람
	public int sendCodeByEmail(String receiver) {
		gratecode = ThreadLocalRandom.current().nextInt(0,100000);
		
		//보낼사람 아이디비번
		String sender = "parasite.ygy@gmail.com";
		String password = "beomunftwjbfqfeu";
		String title = "Jboard2 Code";
		String content = "<h1>Code = "+gratecode+"</h1>";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		//SMTP 세션 설정
		Session gmailsession = Session.getInstance(props, new Authenticator(){
			
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(sender,password);
			}
		});
		//메일발송
		int status = 0;
		Message message = new MimeMessage(gmailsession);
		
		try{
			
			message.setFrom(new InternetAddress(sender,"보보","UTF-8")); //보내는사람
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
			message.setSubject(title); //보낼제목
			message.setContent(content,"text/html;charset=UTF-8"); //내용
			Transport.send(message); //보내기
			
			status = 1;
			
		}catch(Exception e){
			logger.error("Email Error = "+e.getMessage());
			status = 0;
		}
		
		return status;
	}
	//코드비교
	public int cofirmCodeByEmail(int code) {
		logger.info(""+code);
		logger.info(""+gratecode);
		if(code == gratecode) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
}
