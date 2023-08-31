package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.ArticleDAO;
import dto.ArticleDTO;
import service.jboardservice;


@WebServlet("/modify.do")
public class ModifyController extends HttpServlet{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private static final long serialVersionUID = 1L;
	jboardservice service = new jboardservice();
	ArticleDTO dto = new ArticleDTO();
	ArticleDAO dao = new ArticleDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no = req.getParameter("no");
		ArticleDTO dto = new ArticleDTO();
		ArticleDAO dao = new ArticleDAO();
		
		dto = service.selectArticle(no);
		
		req.setAttribute("article", dto);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("modify.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String no = req.getParameter("no");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		int parseno = Integer.parseInt(no);
		dto.setNo(parseno);
		dto.setTitle(title);
		dto.setContent(content);
		service.ArticleModify(dto);
		
		resp.sendRedirect("/Jboard2/modify.do?no="+no);
	}
}
