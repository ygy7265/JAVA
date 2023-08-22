<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.Message"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="javax.mail.Session"%>
<%@page import="java.util.Properties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	//메일 기본정보
	request.setCharacterEncoding("UTF-8");
	String sender = request.getParameter("sender");
	String receiver = request.getParameter("receiver");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String appPass = "reivlvobewlkxkxf"; // Gmil SMTP비밀번호;
	
	//SMTP 서버설정
	Properties props = new Properties();
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "465");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.ssl.enable", "true");
	props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	
	//SMTP 세션 설정
	Session gmailsession = Session.getInstance(props, new Authenticator(){
		
		protected PasswordAuthentication getPasswordAuthentication(){
			return new PasswordAuthentication(sender,appPass);
		}
	});
	//메일발송
	Message message = new MimeMessage(gmailsession);
	
	try{
		message.setFrom(new InternetAddress(sender,"보보","UTF-8")); //보내는사람
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
		message.setSubject(title); //보낼제목
		message.setContent(content,"text/html;charset=UTF-8"); //내용
		Transport.send(message); //보내기
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("../3_MailTest.jsp?success=200");
%>
