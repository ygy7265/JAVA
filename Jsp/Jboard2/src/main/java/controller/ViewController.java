package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.ArticleDTO;
import dto.FileDTO;
import dto.UserDTO;
import service.FileService;
import service.jboardservice;

@WebServlet("/view.do")
public class ViewController extends HttpServlet {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	jboardservice service = new jboardservice();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no = req.getParameter("no");
		
		
		ArticleDTO article = service.articleSelectView(no);
		List<ArticleDTO> comments = service.selectComments(no);
		logger.info("comments :" + comments);
		req.setAttribute("article", article);
		req.setAttribute("comments", comments);
		logger.info("article :" + article);
		RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String content = req.getParameter("content");
		String no = req.getParameter("no");
		HttpSession session = req.getSession();
		UserDTO user = (UserDTO) session.getAttribute("sessUser");
		
		String writer = user.getUid();
		
		String zip = req.getRemoteAddr();
		logger.info("loggerwriter :" + writer);
		ArticleDTO dto = new ArticleDTO();
		dto.setParent(no);
		dto.setContent(content);
		dto.setWriter(writer);
		dto.setRegip(zip);
		
		service.insertComment(dto);
		logger.info("loggerwriter :" + writer);
		
		resp.sendRedirect("/Jboard2/view.do?no="+no);
		
		
	}
}
