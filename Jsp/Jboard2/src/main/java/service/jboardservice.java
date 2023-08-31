package service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ArticleDAO;
import dao.TermsDAO;
import dao.UserDAO;
import dto.ArticleDTO;
import dto.TermsDTO;
import dto.UserDTO;

public class jboardservice {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//Terms
	TermsDAO termsdao = new TermsDAO();
	ArticleDAO articledao = new ArticleDAO();
	public TermsDTO selectTerms() {
		return termsdao.selectTerms();
	}
	
	//Email
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
	
		
	//User
	UserDAO userdao = UserDAO.getInstance(); 
	public UserDTO selectUserUid(String uid) {
		return userdao.selectUserUid(uid);
	}
	public void insertUesr(UserDTO dto) {
		userdao.insertUser(dto);
	}
	
	public UserDTO loginUser(String uid,String pass) {
		return userdao.selectUsers(uid, pass);
	}
	public int updateUserPass(String pass,String uid) {
		return userdao.updateUserPass(pass, uid);
	}
	
	
	public int updateUseforwithdraw(String uid) {
		return userdao.updateUserForWithdraw(uid);
	}
	
	
	
	
	//Count
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
	
	public int selectCountUidAndEmail(String uid,String email) {
		return userdao.selectCountUidAndEmail(uid,email);
	}
	public UserDTO selectUserByNameAndEmail(String name,String email) {
		return userdao.selectUserByNameAndEmail(name,email);
	}
	
	
	
	
	
	//Article
	public ArticleDTO articleSelectView(String no) {
		return articledao.selectArticleview(no);
	}
	public int articleInsert(ArticleDTO dto) {
		return articledao.insertAticle(dto);
	}
	public String renameTo(HttpServletRequest req,String fname) {
		String path = getUploadPath(req);
		//파일명수정
		//확장자 파싱
		int i = fname.lastIndexOf(".");
		String ext = fname.substring(i);
		//파일 고유이름만들기
		String uuid = UUID.randomUUID().toString();
		//고유이름에 확장자붙이기(변경된이름)
		String sName = uuid+ext;

		//경로에 저장해준 파일이름으로 새로운객체생성
		File f1 = new File(path+"/"+fname);
		//고유한이름으로 바꿔줄 객체생성
		File f2 = new File(path+"/"+sName);
		//파일이름변경
		f1.renameTo(f2);
		
		return sName;
	}
	public String getUploadPath(HttpServletRequest req) {
		ServletContext ctx = req.getServletContext();
		String path = ctx.getRealPath("/upload");
		
		return path;
	}
	public MultipartRequest uploadFile(HttpServletRequest req) {
		MultipartRequest mr = null;
		String path = getUploadPath(req);
		int maxSize = 1024 * 1024 * 10;
		try {
			 mr = new MultipartRequest(req,path,maxSize,"UTF-8",new DefaultFileRenamePolicy());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error("uploadFile : "+e.getMessage());
		}
		
		return mr;
	}
	
	public void ArticleModify(ArticleDTO dto) {
		 articledao.updateAticle(dto);
	}
	
	public void downloadFile() {
		
	}
	
	public ArticleDTO selectArticle(String no) {
		return articledao.selectArticle(no);
	}
	public ArticleDTO selectArticleview(String no) {
		return articledao.selectArticleview(no);
	}
	public void deleteArticle(String no) {
		articledao.deleteArticle(no);
	}
	
	public void insertComment(ArticleDTO dto) {
		articledao.insertComment(dto);
	}
	public List<ArticleDTO> selectComments(String parent) {
		return articledao.selectComments(parent);
	}
	
}
