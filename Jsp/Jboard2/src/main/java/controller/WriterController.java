package controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dto.ArticleDTO;
import dto.FileDTO;
import service.FileService;
import service.jboardservice;
@WebServlet("/writer.do")
public class WriterController extends HttpServlet{

	private static final long serialVersionUID = 6044130175477823002L;
	Logger logger = LoggerFactory.getLogger(this.getClass());
	jboardservice service = new jboardservice();
	FileService fileService = new FileService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("write.jsp");
		dispatcher.forward(req, resp);
	}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		MultipartRequest mr = service.uploadFile(req);
		jboardservice service = new jboardservice();
		ArticleDTO dto = new ArticleDTO();
		
		String title = mr.getParameter("title");
		String content = mr.getParameter("content");
		String uid= mr.getParameter("uid");
		String regip = req.getRemoteAddr();
		//파일파라미터이름(변경전이름)
		String fname = mr.getOriginalFileName("file");
		
		dto.setTitle(title);
		dto.setContent(content);
		dto.setFile(fname);
		dto.setRegip(regip);
		dto.setWriter(uid);
		
		int ano = service.articleInsert(dto);
		
		if(fname != null) {
			String sName = service.renameTo(req,fname);
			FileDTO filedto = new FileDTO();
			filedto.setAno(ano);
			filedto.setOfile(fname);
			filedto.setSfile(sName);
			fileService.insertFile(filedto);
		}
		resp.sendRedirect("/Jboard2/list.do?success=100");	
	}
	
}
