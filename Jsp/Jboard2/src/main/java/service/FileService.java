package service;

import java.io.File;
import java.util.List;
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

import dao.ArticleDAO;
import dao.FileDAO;
import dao.TermsDAO;
import dao.UserDAO;
import dto.ArticleDTO;
import dto.FileDTO;
import dto.TermsDTO;
import dto.UserDTO;

public class FileService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	FileDAO filedao = new FileDAO();
	
	public FileDTO selectFile(int fno) {
		return filedao.selectFile(fno);
	}
	public List<FileDTO> selectFiles() {
		return filedao.selectFiles();
	}
	public void insertFile(FileDTO dto) {
		filedao.insertFile(dto);
	}
	
	public FileDTO selectFileName(int ano) {
		return filedao.selectFileName(ano);
	}
}
